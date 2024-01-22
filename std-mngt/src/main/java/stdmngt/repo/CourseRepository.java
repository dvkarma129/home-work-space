package stdmngt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import stdmngt.entity.Course;

public interface CourseRepository extends JpaRepository<Course , Long>{

}
