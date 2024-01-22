package com.quiz.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.dto.QuizDto;

public interface QuizRepo extends JpaRepository<QuizDto, Integer>{

	List<QuizDto> findByCategory(String category);

}
