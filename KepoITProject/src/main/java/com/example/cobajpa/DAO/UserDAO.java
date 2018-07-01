package com.example.cobajpa.DAO;

import java.util.List;

import com.example.cobajpa.model.Pengguna;

public interface UserDAO  {
	public Pengguna getById(long id);
    public List<Pengguna> getByAll();
    public Pengguna getLogin(String username, String password);
    public List<Pengguna> getEmailValid(String email);
    public boolean getExistUsername(String username);
    public void tambahclap(Pengguna u );
    public Pengguna findUserByUsername(String Username);
	public void saveUser(Pengguna pengguna);
	public List<Pengguna> getAllPengguna();
	public void SaveOrUpdate(Pengguna p);
	public void deletePengguna(long id);
	public void deletePengguna(Pengguna p);
	public void save(Pengguna pengguna);
	public boolean findExistUsername(String username);
}
