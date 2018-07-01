package com.example.cobajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.cobajpa.model.Answer;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.service.AnswerService;
import com.example.cobajpa.service.QuestionService;
import com.example.cobajpa.service.PenggunaService;

@Controller
@SessionAttributes("penggunaaktif")
public class AnswerController {
	
	@Autowired
	private AnswerService ado;
	@Autowired
	private QuestionService qdo;
	@Autowired
	private PenggunaService udo;
	
	@RequestMapping(value ="Answer",method=RequestMethod.GET)
    public ModelAndView jawab(@RequestParam("id") Long id){
		ModelAndView mav = new ModelAndView();
		mav.addObject("listuser",udo.jumlahuser());
		mav.addObject("nampilinpertanyaan",qdo.tampilinquestion());
		mav.addObject("question",qdo.getById(id));
        return mav;
    }
	@RequestMapping(value="InsertAnswer",method=RequestMethod.POST)
	public String insertAnswer(@RequestParam("idQuestion")Long id,@SessionAttribute(name="penggunaaktif")Pengguna pengguna,@ModelAttribute("answer")Answer answer,ModelMap mm) {
		answer.setUser(pengguna);
		answer.setQuestion(qdo.getById(id));
		pengguna.setRating(pengguna.getRating()+5);
		ado.SaveOrUpdate(answer);
		udo.SaveOrUpdate(pengguna);
		//mm.put("id", id);
		return "redirect:Answer?id="+id;
		
		
	}

//	@RequestMapping(value="Answer", method=RequestMethod.GET)
//	public ModelAndView nampilinAnswer(@RequestParam("id")Long id,@ModelAttribute("answer")Answer answer,@ModelAttribute("question")Question question) {
//		answer.setQuestion(qdo.getById(id));
//		return ModelAnd
//	}

	
}
