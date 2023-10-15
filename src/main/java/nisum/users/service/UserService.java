package nisum.users.service;

import javax.servlet.http.HttpServletRequest;

import nisum.users.dto.UserDataDTO;
import nisum.users.dto.UserResponseDTO;
import nisum.users.entity.UserEntity;


public interface UserService {

  public String signin(String username, String password);

  public UserResponseDTO signup(UserDataDTO appUserDto);

  public void delete(String username);
  
  public UserEntity search(String username);

  public UserEntity whoami(HttpServletRequest req);

  public String refresh(String username);

}
