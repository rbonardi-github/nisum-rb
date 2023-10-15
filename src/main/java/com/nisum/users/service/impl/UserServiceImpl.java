package com.nisum.users.service.impl;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.entity.UserEntity;
import com.nisum.users.exception.CustomException;
import com.nisum.users.mapper.UserMapper;
import com.nisum.users.repository.UserRepository;
import com.nisum.users.security.JwtTokenProvider;
import com.nisum.users.service.UserService;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtTokenProvider jwtTokenProvider;
	private final AuthenticationManager authenticationManager;
	private final UserMapper userMapper;

	@Override
	public String signin(String username, String password) {
		try {

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

			return jwtTokenProvider.createToken(username, userRepository.findByUsername(username).getAppUserRoles());

		} catch (AuthenticationException e) {

			throw new CustomException("Invalid username/password supplied", HttpStatus.UNPROCESSABLE_ENTITY);

		}
	}

	@Override
	public UserResponseDTO signup(UserDataDTO appUserDto) {
		
		if (appUserDto.getUsername() == null || appUserDto.getUsername().isEmpty()) {
			throw new CustomException("Username is null or is is empty", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		if (appUserDto.getEmail() == null || appUserDto.getEmail().isEmpty()) {
			throw new CustomException("Email is null or is is empty", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		if (userRepository.existsByUsername(appUserDto.getUsername())) {
			throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		if (userRepository.existsByEmail(appUserDto.getEmail())) {
			throw new CustomException("Email is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		if (!patternMatches(appUserDto.getEmail())) {
			throw new CustomException("Incorrect email format", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		
		UserEntity appUser = userMapper.userDataDtoToUserEntity(appUserDto);

		appUser = userRepository.save(appUser);

		UserResponseDTO userResponseDTO = userMapper.userEntityToUserResponseDTO(appUser);
		userResponseDTO.setToken(jwtTokenProvider.createToken(appUserDto.getUsername(), appUserDto.getAppUserRoles()));

		return userResponseDTO;

	}

	public static boolean patternMatches(String emailAddress) {
		
		String regexPattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}+.cl";
		
	    return Pattern.compile(regexPattern)
	      .matcher(emailAddress)
	      .matches();
	}
	
	@Override
	public void delete(String username) {
		userRepository.deleteByUsername(username);
	}

	@Override
	public UserEntity search(String username) {
		UserEntity appUser = userRepository.findByUsername(username);
		if (appUser == null) {
			throw new CustomException("The user doesn't exist", HttpStatus.NOT_FOUND);
		}
		return appUser;
	}

	@Override
	public UserEntity whoami(HttpServletRequest req) {
		return userRepository.findByUsername(jwtTokenProvider.getUsername(jwtTokenProvider.resolveToken(req)));
	}

	@Override
	public String refresh(String username) {
		return jwtTokenProvider.createToken(username, userRepository.findByUsername(username).getAppUserRoles());
	}

}
