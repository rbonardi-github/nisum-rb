package nisum.users;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import nisum.users.entity.UserEntity;
import nisum.users.entity.UserPhonesEntity;
import nisum.users.entity.UserRoleEntity;
import nisum.users.service.UserService;

@SpringBootApplication
@OpenAPIDefinition
@EnableWebMvc
@RequiredArgsConstructor
public class JwtAuthServiceApp {

  final UserService userService;

  public static void main(String[] args) {
	    SpringApplication.run(JwtAuthServiceApp.class, args);
  }

}
