package com.example.cobajpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cobajpa.DAO.UserDAO;
import com.example.cobajpa.component.EmailServiceImpl;
import com.example.cobajpa.model.Pengguna;
import com.example.cobajpa.model.Question;
import com.example.cobajpa.repository.PenggunaRepository;


@Service
public class PenggunaService implements UserDAO {
	@Autowired
	PenggunaRepository penggunaRepository;
	
	@Autowired
	EmailServiceImpl emailServiceImpl;
	
	@Override
	public List<Pengguna> getAllPengguna(){
		List<Pengguna> lp=new ArrayList<>();
		penggunaRepository.findAll().forEach(lp::add);
		return lp;
	}
	@Override
	public Pengguna getById(long id) {
		Pengguna p=penggunaRepository.findById(id).get();
		return p;
	}
	@Override
	public void SaveOrUpdate(Pengguna p) {
		penggunaRepository.save(p);
	}
	@Override
	public void deletePengguna(long id) {
		penggunaRepository.deleteById(id);
	}
	@Override
	public void deletePengguna(Pengguna p) {
		penggunaRepository.delete(p);
	}
	@Override
	public void save(Pengguna pengguna) {
        pengguna.setPassword(pengguna.getPassword());
        pengguna.setUsername(pengguna.getUsername());
      
    }

	@Override
	public boolean findExistUsername(String username) {
		return false;
	}

	@Override
	public List<Pengguna> getByAll() {
		List<Pengguna> lp = new ArrayList<>();
		penggunaRepository.findAll().forEach(lp::add);
		return lp;
		
	}
	@Override
	public Pengguna getLogin(String username, String password) {
		return penggunaRepository.findByUsernameAndPassword(username, password);
	}
	@Override
	public List<Pengguna> getEmailValid(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean getExistUsername(String username) {
		return (penggunaRepository.findExistUsername(username)!= null);
}
	@Override
	public void tambahclap(Pengguna u) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Pengguna findUserByUsername(String Username) {
		return penggunaRepository.findByUsername(Username);
	}
	@Override
	public void saveUser(Pengguna pengguna) {
		// TODO Auto-generated method stub
		
	}
	public void SaveOrUpdateWithEmail(Pengguna p) {
		 penggunaRepository.save(p);
		 emailServiceImpl.sendMessage(p.getEmail(),"Verifikasi Pengguna Berhasil","Selamat anda telah terdaftar silakan lihat website kami untuk login ");
	}

	public int jumlahuser(){
		return penggunaRepository.jumlahuser().size();

	}


}
