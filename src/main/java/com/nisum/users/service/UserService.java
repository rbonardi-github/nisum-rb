package com.nisum.users.service;

import javax.servlet.http.HttpServletRequest;

import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.entity.UserEntity;


public interface UserService {

  public String signin(String username, String password);

  public UserResponseDTO signup(UserDataDTO appUserDto);

  public void delete(String username);
  
  public UserEntity search(String username);

  public UserEntity whoami(HttpServletRequest req);

  public String refresh(String username);

}
