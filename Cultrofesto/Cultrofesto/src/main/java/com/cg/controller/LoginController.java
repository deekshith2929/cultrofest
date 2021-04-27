package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Login;
import com.cg.repository.LoginRepository;
import com.cg.service.LoginService;

@RestController
public class LoginController {
	@Autowired
	private LoginService loginServ;
	 @Autowired
	 private	LoginRepository loginRepo;
	
	@PostMapping("/add")
	public Login addAdmin( @RequestBody Login login) {
		return loginServ.add(login);
	}
	
    @GetMapping("/authenticate")
    public String authenticate(@RequestBody Login login){
  			boolean status=loginServ.authenticate(login);
  			if(status) 
				return "success";
			else
				return "fail";
  		}
}
