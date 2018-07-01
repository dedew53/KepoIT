package com.example.cobajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.cobajpa.DAO.QuestionDAO;

import com.example.cobajpa.model.Question;
import com.example.cobajpa.repository.PageRepository;
import com.example.cobajpa.repository.QuestionRepository;

@Service
public class QuestionService implements QuestionDAO {
	
	@Autowired
	QuestionRepository questionRepo;
	
//	@Autowired
//	PageRepository pageRepo;
	

	@Override
	public Question getById(long id) {
		Question q=questionRepo.findById(id).get();
		return q;
	}

	@Override
	public List<Question> getByAll() {
		List<Question> lq = new ArrayList<>();
		questionRepo.findAll().forEach(lq::add);
		return lq;
	}
	

	@Override
	public void SaveOrUpdate(Question q) {
		questionRepo.save(q);
		
	}

	@Override
	public void deleteQuestion(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteQuestion(Question q) {
		// TODO Auto-generated method stub
		
	}
	public List<Question> getByUser(Long id){
		return questionRepo.findByLogInUser(id);
	}



	@Override
	public Page<Question> findAll(Pageable pageable) {
		return questionRepo.findAll(pageable);
		
	}


	public int tampilinquestion() {
		return questionRepo.tampilinquestion().size();
	}


}
