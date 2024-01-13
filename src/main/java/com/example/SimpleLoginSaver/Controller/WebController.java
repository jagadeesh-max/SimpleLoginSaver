package com.example.SimpleLoginSaver.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SimpleLoginSaver.Services.WebServices;
import com.example.SimpleLoginSaver.Services.WebServicesImp;

@Controller
@RequestMapping("/web2")

public class WebController {
	
	@Autowired
	WebServices ws;
	
	public WebController(WebServices ws) {
		super();
		this.ws = ws;
	}

	@GetMapping("/viewlogin")
	public String mapViewLogin()
	{
		return "login";
	}
	
	@GetMapping("/viewRegister")
	public String mapViewRegister()
	{
		return "index";
	}
	
	@PostMapping
	public String addUser(@RequestParam("username")String name,
			             @RequestParam("email")String email,
			             @RequestParam("pwd")String pass)
	{
		System.out.println(ws.addUser(name, email, pass));
		return "login";  
		
	}
	
	@GetMapping
	public String login(@RequestParam("email") String email,
			            @RequestParam("pwd")String pass)
	{
		return "Success";
	}

}
