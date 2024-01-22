package com.quiz.ctrl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.dto.QuizDto;
import com.quiz.service.QuizService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuizCtrl {

	private final QuizService quizService;

	@GetMapping
	public ResponseEntity<List<QuizDto>> getAllQuestions() {
		List<QuizDto> quizDtos = quizService.getAllQuestions();
		return new ResponseEntity<>(quizDtos, HttpStatus.OK);
	}

	@GetMapping("/{category}")
	public ResponseEntity<List<QuizDto>> getAllQuestionsByCategory(@PathVariable String category) {
		List<QuizDto> quizDtos = quizService.getAllQuestionsByCategory(category);
		return new ResponseEntity<>(quizDtos, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<QuizDto> addNewQuestion(@RequestBody QuizDto model) {
		return new ResponseEntity<QuizDto>(quizService.addQuestion(model), HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<QuizDto> updateQuestion(@RequestBody QuizDto model) {
		return new ResponseEntity<QuizDto>(quizService.upadteQuestion(model), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable int id){
		return new ResponseEntity<String>(quizService.deleteQuestion(id),HttpStatus.OK);
	}
}
