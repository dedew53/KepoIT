package com.example.cobajpa.DAO;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.cobajpa.model.Question;

public interface QuestionDAO {
		public Question getById(long id);
	    public List<Question> getByAll();
	    public void SaveOrUpdate(Question q);
		public void deleteQuestion(long id);
		public void deleteQuestion(Question q);
		
		Page<Question> findAll(Pageable pageable);
//		public List<Question>  getquestion();


}
