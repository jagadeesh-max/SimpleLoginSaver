package com.example.SimpleLoginSaver.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SimpleLoginSaver.Entity.UserDatabase;
import com.example.SimpleLoginSaver.Repository.WebRepository;


@Service
public class WebServicesImp implements WebServices{
	
	@Autowired
	WebRepository wr;
	

	public WebServicesImp(WebRepository wr) {
		super();
		this.wr = wr;
	}


	@Override
	public String addUser(String name, String email, String pass) {
		// TODO Auto-generated method stub
		UserDatabase ud=new UserDatabase(name, email, pass);
		wr.save(ud);
		return "data saved";
	}

}
