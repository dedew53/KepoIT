//package com.example.cobajpa.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import com.example.cobajpa.model.Pengguna;
//import com.example.cobajpa.model.Question;
//import com.example.cobajpa.repository.PenggunaRepository;
//import com.example.cobajpa.repository.QuestionRepository;
//
//@Service
//@Transactional
//public class PaginationService implements QuestionRepository {
//
////	@Override
////	public List<Question> findAll() {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public List<Question> findAll(Sort sort) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public List<Question> findAllById(Iterable<Long> ids) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> List<S> saveAll(Iterable<S> entities) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public void flush() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public <S extends Question> S saveAndFlush(S entity) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public void deleteInBatch(Iterable<Question> entities) {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void deleteAllInBatch() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public Question getOne(Long id) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> List<S> findAll(Example<S> example) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> List<S> findAll(Example<S> example, Sort sort) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public Page<Question> findAll(Pageable pageable) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> S save(S entity) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public Optional<Question> findById(Long id) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public boolean existsById(Long id) {
////		// TODO Auto-generated method stub
////		return false;
////	}
////
////	@Override
////	public long count() {
////		// TODO Auto-generated method stub
////		return 0;
////	}
////
////	@Override
////	public void deleteById(Long id) {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void delete(Question entity) {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void deleteAll(Iterable<? extends Question> entities) {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public void deleteAll() {
////		// TODO Auto-generated method stub
////		
////	}
////
////	@Override
////	public <S extends Question> Optional<S> findOne(Example<S> example) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> Page<S> findAll(Example<S> example, Pageable pageable) {
////		// TODO Auto-generated method stub
////		return null;
////	}
////
////	@Override
////	public <S extends Question> long count(Example<S> example) {
////		// TODO Auto-generated method stub
////		return 0;
////	}
////
////	@Override
////	public <S extends Question> boolean exists(Example<S> example) {
////		// TODO Auto-generated method stub
////		return false;
////	}
////
////	@Override
////	public List<Question> findByLogInUser(Long id) {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
////	@Override
////	public Page<Question> listAllByPage(java.awt.print.Pageable pageable) {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//	
//
//}
