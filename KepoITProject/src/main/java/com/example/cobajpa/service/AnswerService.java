package com.example.cobajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cobajpa.DAO.AnswerDAO;
import com.example.cobajpa.model.Answer;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;
import com.example.cobajpa.repository.AnswerRepository;




@Service
public class AnswerService implements AnswerDAO {
	
	@Autowired
	AnswerRepository ar;
	
	

	@Override
	public Answer getById(long id) {
		Answer a=ar.findById(id).get();
		return a;
		
	}

	@Override
	public List<Answer> getByAll() {
		List<Answer> la = new ArrayList<>();
		ar.findAll().forEach(la::add);
		return la;
	}
	@Override
	public void SaveOrUpdate(Answer a) {
		 ar.save(a);
		}


	@Override
	public void tambahClap(Pengguna u, Answer a) {
		// TODO Auto-generated method stub
		
	}
	
//	public List<Answer> getAllPerson(){
//		List<Answer> la=new ArrayList<>();
//		ar.findAll().forEach(la::add);
//		return la;
//	}
	
	public List<Answer> getByAllAnswer(Long id){
		List<Answer> la = new ArrayList<>();
		ar.findByQuestion(id);
		return la;
	}
	
	
}
