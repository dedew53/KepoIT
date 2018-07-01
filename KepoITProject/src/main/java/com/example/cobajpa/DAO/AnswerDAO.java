package com.example.cobajpa.DAO;

import java.util.List;

import com.example.cobajpa.model.Answer;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;

public interface AnswerDAO {
    public Answer getById(long id);
    public List<Answer> getByAll();
    public void tambahClap(Pengguna u,Answer a);
	public void SaveOrUpdate(Answer a );
}
