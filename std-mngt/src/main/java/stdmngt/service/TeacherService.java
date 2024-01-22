package stdmngt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stdmngt.entity.Course;
import stdmngt.entity.Teacher;
import stdmngt.repo.CourseRepository;
import stdmngt.repo.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private CourseRepository courseRepository;

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long teacherId) {
        return teacherRepository.findById(teacherId).orElse(null);
    }

    public Teacher addTeacher(Teacher teacher, Long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        course.ifPresent(teacher::setCourse);
        return teacherRepository.save(teacher);
    }

    public Teacher updateTeacher(Teacher teacher, Long teacherId, Long courseId) {
        Optional<Course> course = courseRepository.findById(courseId);
        if (course.isPresent()) {
            Teacher existingTeacher = teacherRepository.findById(teacherId).orElse(null);
            if (existingTeacher != null) {
                existingTeacher.setFname(teacher.getFname());
                existingTeacher.setLname(teacher.getLname());
                existingTeacher.setCourse(course.get());
                return teacherRepository.save(existingTeacher);
            }
        }
        return null;
    }

    public void deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
    }
}
