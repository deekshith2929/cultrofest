package com.cg.service;

import java.util.Optional;

import com.cg.model.Login;


public interface LoginService {

	public Optional<Login> getLoginById(int Id);
    public boolean authenticate(Login login);

	   public Login changePassword(Login login);
	   
	   public Login add(Login login);
}
