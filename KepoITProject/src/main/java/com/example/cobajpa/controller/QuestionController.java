package com.example.cobajpa.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;
import com.example.cobajpa.repository.PageRepository;
import com.example.cobajpa.service.QuestionService;
import com.example.cobajpa.service.PenggunaService;

import java.util.Date;

@Controller
@SessionAttributes("penggunaaktif")
public class QuestionController {
	@Autowired
	QuestionService qdo;
	@Autowired
	PenggunaService udo;
	@Autowired
	PageRepository pr;


	@RequestMapping(value = "InsertQuestion", method = RequestMethod.POST)
	public ModelAndView masukin(@SessionAttribute(name = "penggunaaktif") Pengguna p, @ModelAttribute("question") Question q) {
		q.setUser(p);
		p.setRating(p.getRating() + 3);
		qdo.SaveOrUpdate(q);
		udo.SaveOrUpdate(p);
		return new ModelAndView("InsertQuestion", "question", q);
	}

	@RequestMapping(value = "QuestionBaru", method = RequestMethod.GET)
	public ModelAndView ambiluser(@RequestParam("id") Long id, @ModelAttribute("penggunaaktif") Pengguna p) {

		return new ModelAndView("Pengguna", "pengguna", qdo.getByUser(p.getId()));
	}

	@RequestMapping(value = "Question.html", method = RequestMethod.GET)
	public ModelAndView nampilin(@ModelAttribute("question") Question question) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lq",qdo.getByAll());
		mav.addObject("listuser",udo.jumlahuser());
		mav.addObject("nampilinpertanyaan",qdo.tampilinquestion());
		mav.setViewName("Question.html");
		return mav;
	}



	@RequestMapping(value = "EditQuestion", method = RequestMethod.GET)
	public ModelAndView Edit1(@RequestParam("id") Long id) {
		return new ModelAndView("EditQuestion", "question", qdo.getById(id));
	}
	@RequestMapping(value = "EditQuestion", method = RequestMethod.POST)
	public ModelAndView editpost(@SessionAttribute(name = "penggunaaktif") Pengguna p, @ModelAttribute("question") Question q) {
		q.setTgl_question(new Date());
		qdo.SaveOrUpdate(q);
		return new ModelAndView("InsertQuestion", "question", q);
	}

//	@RequestMapping(value = "/Question", method = RequestMethod.GET)
//	Page<Question> list(Pageable pageable) {
//		Page<Question> questions = qdo.findAll(pageable);
//		return questions;
//	}

//	@RequestMapping(value="Question.html", method=RequestMethod.GET)
//	public ModelAndView nampilinque(@ModelAttribute("question")Question question,@ModelAttribute("pengguna")Pengguna pengguna) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("listuser",udo.jumlahuser());
//		mav.addObject("nampilinpertanyaan",qdo.tampilinquestion());
//		mav.setViewName("Question.html");
//
//		return mav;
//	}


//	@RequestMapping("/list")
//	public String questionList(Model model, Pageable pageable) {
//		Page<Question> pages= pr.findAll(pageable);
//		model.addAttribute("number",pages.getNumber());
//		model.addAttribute("totalPages",pages.getTotalPages());
//		model.addAttribute("totalElements",pages.getTotalElements());
//		model.addAttribute("size",pages.getSize());
//		model.addAttribute("question",pages.getContent());
//		return "question/list";
//	}


	//	@RequestMapping(value="InsertQuestion",method=RequestMethod.POST)
//	public ModelAndView masukin(@RequestParam("usernameUser")String Username, @ModelAttribute("question")Question q) {
//		Pengguna p = udo.findUserByUsername(Username);
//		q.setUser(p);
//		qdo.SaveOrUpdate(q);
//		return new ModelAndView("InsertQuestion","question",q);
//	}




}
	

