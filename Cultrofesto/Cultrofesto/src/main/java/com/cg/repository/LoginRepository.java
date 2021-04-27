package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Login;

public interface LoginRepository extends JpaRepository<Login,Long>{
	

	Login findByAdminid(long adminid);


}
