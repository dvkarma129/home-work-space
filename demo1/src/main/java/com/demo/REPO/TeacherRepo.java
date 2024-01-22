package com.demo.REPO;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.DTO.TeacherDTO;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherDTO, Integer>{

	List<TeacherDTO> findByTeacherIdAndTeacherAge(int teacherId, int teacherAge);

}
