package com.example.cobajpa.controller;

import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes("penggunaaktif")
public class HomeController implements ErrorController {

	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	@RequestMapping("index.html")
	public String goIndex1() {
		return "index";
	}
	@RequestMapping("TentangKami.html")
	public String goTampilan() {
		return "TentangKami";
	}
	@RequestMapping("BerandaProfil.html")
	public String goBeranda() {
		return "BerandaProfil";
	}
	@RequestMapping("Peraturan.html")
	public String goPeraturan() {
		return "Peraturan";
	}
	@RequestMapping("Rating.html")
	public String goRating() {
		return "Rating";
	}
	@RequestMapping("Postingan.html")
	public String goPostingan() {
		return "Postingan";
	}
//	@RequestMapping("Question.html")
//	public String goQuestion() {
//		return "Question";
//	}
	@RequestMapping("Home.html")
	public String gohome() {
		return "Home";
	}
	@RequestMapping("SharingAnswer.html")
	public String goSA() {
		return "SharingAnswer";
	}
	@RequestMapping("Tags.html")
	public String goTags() {
		return "Tags";
	}
	@RequestMapping("Answer.html")
	public String goAnswer() {
		return "Answer";
	}
	@RequestMapping("ValidasiEmail.html")
	public String goValidasi() {
		return "ValidasiEmail";
	}
	@RequestMapping(value="InsertQuestion.html")
	public String goInsert() {
		return "InsertQuestion";
	}
	@RequestMapping("QuestionBaru.html")
	public String goBaru() {
		return "QuestionBaru";
	}
	@RequestMapping("EditQuestion.html")
	public String goEditQuestion() {
		return "EditQuestion";
	}
	@RequestMapping("UbahProfil.html")
	public String goUbah() {
		return "UbahProfil";
	}
	@RequestMapping("/error")
	public String eror() {
		return "error";
	}
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}


	
}
