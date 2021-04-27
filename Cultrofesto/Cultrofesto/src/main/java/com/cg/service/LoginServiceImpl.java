package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Login;
import com.cg.repository.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepo;
	
	@Override
	public Optional<Login> getLoginById(int Id) {
		return null;

	}

	@Override
	public boolean authenticate(Login login) {
		Login login1=loginRepo.findByAdminid(login.getAdminid());
		if(((login1.getAdminid())==(login.getAdminid())) && (login.getPassword().equals(login1.getPassword()))) 
				{
			       return true;
				}
		return false;
		}

	@Override
	public Login changePassword(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Login add(Login login) {
		return loginRepo.save(login);
	}

}
