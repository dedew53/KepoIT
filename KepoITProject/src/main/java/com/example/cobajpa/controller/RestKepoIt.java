package com.example.cobajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cobajpa.model.Answer;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;
import com.example.cobajpa.service.AnswerService;
import com.example.cobajpa.service.QuestionService;
import com.example.cobajpa.service.PenggunaService;

@RestController
public class RestKepoIt {
	@Autowired
	AnswerService ado;
	@Autowired
	QuestionService qdo;
	@Autowired
	PenggunaService udo;
	
	@RequestMapping("AnswerRest")
	public List<Answer> getall(){return ado.getByAll();}
	@RequestMapping("QuestionRest")
	public List<Question> getallq(){return qdo.getByAll();}
	@RequestMapping("PenggunaRest")
	public List<Pengguna> getallp(){return udo.getByAll();}

	@RequestMapping("/API/isUserExist")
	public boolean isUserExist(@RequestParam("username") String username){
		return udo.getExistUsername(username);
	}
}
