package com.difinite.hascode;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// INI TEST COMMIT
@SpringBootApplication
@RestController
@EnableResourceServer
public class HascodeAuthApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(HascodeAuthApplication.class, args);
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		System.out.println("USERNAME = " + user.getName());
		return user;
	}

}
