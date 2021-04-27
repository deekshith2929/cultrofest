package com.cg.service;

import java.util.Optional;

import com.cg.model.Login;


public interface LoginService {

	public Optional<Login> getLoginByName(String name);
    public boolean authenticate(Login login);

	   public Login changePassword(Login login);
	   
	   public Login add(Login login);
}
