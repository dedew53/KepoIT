package com.example.cobajpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.cobajpa.model.Pengguna;

import java.util.List;

@Repository
public interface PenggunaRepository extends JpaRepository<Pengguna, Long> {
	 Pengguna findByUsername(String Username);
	 Pengguna findByUsernameAndPassword(String username,String password);

	 @Query("select a.username from Pengguna a where a.username =:username")
	 String findExistUsername(@Param("username") String username);

	 @Query(value = "Select * from [kepo2].[dbo].[pengguna] ",nativeQuery = true)
	 List<Pengguna>jumlahuser();
}
