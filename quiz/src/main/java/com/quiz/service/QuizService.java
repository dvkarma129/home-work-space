package com.quiz.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.dto.QuizDto;
import com.quiz.repo.QuizRepo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizService {

	private final QuizRepo quizRepo;

	public List<QuizDto> getAllQuestions() {
		// TODO Auto-generated method stub
		return quizRepo.findAll();
	}

	public List<QuizDto> getAllQuestionsByCategory(String category) {
		return quizRepo.findByCategory(category);
	}

	@Transactional
	public QuizDto addQuestion(QuizDto model) {
		return quizRepo.save(model);
	}

	public QuizDto upadteQuestion(QuizDto model) {
		QuizDto existingDto = quizRepo.getById(model.getId());

		existingDto.setQuestion(model.getQuestion());
		existingDto.setOption1(model.getOption1());
		existingDto.setOption2(model.getOption2());
		existingDto.setOption3(model.getOption3());
		existingDto.setOption4(model.getOption4());
		existingDto.setAnswer(model.getAnswer());
		existingDto.setDificulty(model.getDificulty());
		existingDto.setCategory(model.getCategory());
		return quizRepo.save(existingDto);
	}

	public String deleteQuestion(int id) {
		// TODO Auto-generated method stub
				quizRepo.deleteById(id);
				return "Deleted";
	}
}
