
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pass;

public interface PassRepos extends JpaRepository<Pass, Integer> {

	
	Pass findByStatus(String status);
	
	Pass findByFullname(String fullname);
	
	
}
