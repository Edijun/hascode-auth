package com.difinite.hascode.dao;

import org.springframework.data.repository.CrudRepository;

import com.difinite.hascode.model.Users;
//
public interface UserDao extends CrudRepository<Users, Long>{
	Users findByUsername(String username);
}
