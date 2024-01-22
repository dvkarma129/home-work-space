package stdmngt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import stdmngt.entity.Student;
import stdmngt.repo.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student, Long studentId) {
        if (studentRepository.existsById(studentId)) {
            student.setId(studentId);
            return studentRepository.save(student);
        }
        return null;
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
