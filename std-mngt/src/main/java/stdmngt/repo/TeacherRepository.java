package stdmngt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import stdmngt.entity.Student;
import stdmngt.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher , Long>{

}
