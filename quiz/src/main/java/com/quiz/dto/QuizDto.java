package com.quiz.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class QuizDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	String question;

	String option1;

	String option2;

	String option3;

	String option4;

	String answer;

	String dificulty;
	
	String category;
}
