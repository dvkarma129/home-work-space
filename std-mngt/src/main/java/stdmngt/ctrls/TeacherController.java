package stdmngt.ctrls ;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import stdmngt.entity.Teacher;
import stdmngt.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/allTeachers")
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    @GetMapping("/{teacherId}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long teacherId) {
        Teacher teacher = teacherService.getTeacherById(teacherId);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }

    @PostMapping("/add/{courseId}")
    public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher, @PathVariable Long courseId) {
        Teacher addedTeacher = teacherService.addTeacher(teacher, courseId);
        return new ResponseEntity<>(addedTeacher, HttpStatus.CREATED);
    }

    @PutMapping("/update/{teacherId}/course/{courseId}")
    public ResponseEntity<Teacher> updateTeacher(@Valid @RequestBody Teacher teacher, @PathVariable Long teacherId,
                                                 @PathVariable Long courseId) {
        Teacher updatedTeacher = teacherService.updateTeacher(teacher, teacherId, courseId);
        return new ResponseEntity<>(updatedTeacher, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{teacherId}")
    public ResponseEntity<String> deleteTeacher(@PathVariable Long teacherId) {
        teacherService.deleteTeacher(teacherId);
        return new ResponseEntity<>("Teacher deleted successfully", HttpStatus.OK);
    }
}
