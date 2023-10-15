package com.nisum.users;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import com.nisum.users.service.UserService;

@SpringBootApplication
@OpenAPIDefinition
@EnableWebMvc
@RequiredArgsConstructor
public class ServiceApplication {

  final UserService userService;

  public static void main(String[] args) {
	    SpringApplication.run(ServiceApplication.class, args);
  }

}
