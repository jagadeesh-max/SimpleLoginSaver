package com.example.SimpleLoginSaver.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SimpleLoginSaver.Entity.UserDatabase;

public interface WebRepository extends JpaRepository<UserDatabase,String> {
	
	

}
