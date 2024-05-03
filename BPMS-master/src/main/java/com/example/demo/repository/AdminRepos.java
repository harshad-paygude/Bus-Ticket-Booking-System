package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Admin;

public interface AdminRepos extends JpaRepository<Admin, Integer> {
	
	Admin findByGmailAndPass(String gmail,String pass);

}
