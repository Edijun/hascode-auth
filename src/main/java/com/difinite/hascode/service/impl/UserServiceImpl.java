package com.difinite.hascode.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.difinite.hascode.dao.UserDao;
import com.difinite.hascode.model.Users;

@Service(value = "userService")
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;

//	@Override
//	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//		Users user = userDao.findByUsername(userId);
//
//		System.out.println("USERNAME = " + user.getUsername());
//		if (user == null) {
//			throw new UsernameNotFoundException("Invalid username or password.");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//				getAuthority());
//	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userDao.findByUsername(username);
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

}
