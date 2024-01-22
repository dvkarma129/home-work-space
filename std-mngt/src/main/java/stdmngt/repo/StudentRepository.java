package stdmngt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import stdmngt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
