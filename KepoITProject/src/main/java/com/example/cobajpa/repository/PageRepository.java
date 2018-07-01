package com.example.cobajpa.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.cobajpa.model.Question;

public interface PageRepository extends JpaRepository<Question, Long>{
//	Page<Question> listAllByPage(Pageable pageable);
}
