package com.example.cobajpa.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cobajpa.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>{
	
//	Page<Question> questionList(Pageable pageable);
	
	@Query("select q from Question q where q.user.id= :id")
	List<Question> findByLogInUser(@Param("id") Long id);
	
	Page<Question> findAll(Pageable pageable);


	@Query(value = "Select * from [kepo2].[dbo].[question] ",nativeQuery = true)
	public List<Question>  tampilinquestion();
	
}
