package com.example.cobajpa.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.cobajpa.model.Question;
import com.example.cobajpa.service.QuestionService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.cobajpa.helper.HelperEncripsi;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.service.PenggunaService;



@Controller
@SessionAttributes("penggunaaktif")
public class PenggunaController {
	
	String currentDate = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
	@Autowired
	private PenggunaService udo;
	@Autowired
	private QuestionService qdo;
	 
	
	@RequestMapping(value="ValidasiEmail",method=RequestMethod.POST)
	public String register(@RequestParam("nama")String nama, @RequestParam("password")String password, @RequestParam("username")String username,
			@RequestParam("email")String email) {
		Pengguna p = new Pengguna();
		try {
			p.setPassword(HelperEncripsi.getSha256(password));
		}catch(Exception e) {
			e.printStackTrace();
		}	
		p.setUsername(username);
		p.setNama(nama);
		p.setEmail(email);
		udo.SaveOrUpdateWithEmail(p);
		return "ValidasiEmail";
		
	}
//	@RequestMapping(value={"Home"}, method = RequestMethod.POST)
//	public ModelAndView login(@ModelAttribute("pengguna")Pengguna pengguna,@RequestParam("password")String password,@RequestParam("username")String username){
//		ModelAndView mav=new ModelAndView();
//		Pengguna p=udo.getLogin(username, HelperEncripsi.getSha256(password));
//		if(p== null) {
//			mav.setViewName("index");
//		}
//		else {
//			mav.addObject("penggunaaktif",p);
//			mav.setViewName("Home");
//		}
//		return mav;
//	}
		@RequestMapping(value={"Home"}, method = RequestMethod.POST)
	public String login(@ModelAttribute("pengguna")Pengguna pengguna,@RequestParam("password")String password,@RequestParam("username")String username,ModelMap mm){
		String page = null;
			Pengguna p=udo.getLogin(username, HelperEncripsi.getSha256(password));
			if(p== null) {
				page="redirect:/";
			}
			else {
				mm.put("penggunaaktif",p);
				page="redirect:Home.html";
			}
		return page;
	}




	@RequestMapping(value="ubahPassword", method=RequestMethod.GET)
	public String keUbahPassword() {
		return "BerandaProfil.html";
	}
	@RequestMapping(value="ubahPassword", method=RequestMethod.POST)
	public String ubahPass(@ModelAttribute("penggunaaktif")Pengguna pengguna,@RequestParam("password")String password) {
		pengguna.setPassword(HelperEncripsi.getSha256(password));
		udo.SaveOrUpdate(pengguna);
		return "redirect:BerandaProfil.html";
	}
	
	private String saveDirectory="C:/Users/Ishaq Fakhrozi/Documents/workspace-sts-3.9.4.RELEASE/KepoIT/src/main/resources/static/image/";
	@RequestMapping(value="UbahProfil",method=RequestMethod.POST)
	private String ubahProfil(@ModelAttribute("penggunaaktif")Pengguna p,@RequestParam("foto")MultipartFile file,@RequestParam("idPengguna")Long id,RedirectAttributes redirectAttributes,
							  @RequestParam("nama")String nama,@RequestParam("alamat")String alamat,@RequestParam("nohp")String noHp ){
		try {
			byte[] bytes = file.getBytes();
			String a= file.getOriginalFilename().replace(file.getOriginalFilename(), FilenameUtils.getBaseName(file.getOriginalFilename()).concat(currentDate) + "." + FilenameUtils.getExtension(file.getOriginalFilename())).toLowerCase();
			p.setFotoProfil(a);
			p.setId(id);
			p.setNama(nama);
			p.setAlamat(alamat);
			p.setNoHp(noHp);
			Path path = Paths.get(saveDirectory + a);
			Files.write(path, bytes);
			udo.SaveOrUpdate(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return"BerandaProfil.html";
	}
	
	@RequestMapping(value="UbahProfil", method=RequestMethod.GET)
	private ModelAndView editProfil(@ModelAttribute("penggunaaktif")Pengguna pengguna, @RequestParam("idUbah")Long id) {
		return new ModelAndView("UbahProfil","pengguna",udo.getById(pengguna.getId()));
	}

	@RequestMapping(value = "BerandaProfil.html", method = RequestMethod.GET)
	public ModelAndView nampilinber(@ModelAttribute("question") Question question, @ModelAttribute("pengguna") Pengguna pengguna) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("listuser", udo.jumlahuser());
		mav.addObject("nampilinpertanyaan", qdo.tampilinquestion());
		mav.setViewName("BerandaProfil.html");

		return mav;
	}
	@RequestMapping(value = "UbahProfil.html", method = RequestMethod.GET)
	public ModelAndView nampilina(@ModelAttribute("question") Question question, @ModelAttribute("pengguna") Pengguna pengguna) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lq", qdo.getByAll());
		mav.addObject("listuser", udo.jumlahuser());
		mav.addObject("nampilinpertanyaan", qdo.tampilinquestion());
		mav.setViewName("UbahProfil.html");

		return mav;
	}
	@RequestMapping(value = "Home.html", method = RequestMethod.GET)
	public ModelAndView nampilinHome(@ModelAttribute("question") Question question, @ModelAttribute("pengguna") Pengguna pengguna) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("lq", qdo.getByAll());
		mav.addObject("listuser", udo.jumlahuser());
		mav.addObject("nampilinpertanyaan", qdo.tampilinquestion());
		mav.setViewName("Home.html");

		return mav;
	}
//	@RequestMapping("/logout")
//	public String goLogOut(HttpSession session,SessionStatus status) {
//		status.setComplete();
//		session.removeAttribute("penggunaaktif");
//		return "index";
//	}



	
//	@RequestMapping(value="BerandaProfil.html", method=RequestMethod.GET)
//	public String nampilinUser(@ModelAttribute("penggunaaktif")Pengguna pengguna, ModelMap mm) {
//	mm.put("penggunaaktif",pengguna);
//	return "BerandaProfil";
	
//}
//	/*@RequestMapping(value="BerandaProfil", method=RequestMethod.GET)
//	public String nampilinUser(@ModelAttribute("penggunaaktif")Pengguna pengguna) {
//	return new String("BerandaProfil","pengguna",udo.getById(pengguna.getId()));
//}
//	*/
	
//	List page
//	@RequestMapping(value = "list", method = RequestMethod.GET)
//    public String getEmployees(ModelMap model) {
//            
//        model.addAttribute("employees", this.employeeService.getEmployees(page));
//        return "listing";
//	}
}
