package com.nisum.users.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserPhonesDTO;
import com.nisum.users.entity.UserRoleEntity;


public class MockEntities {
	
	public static UserDataDTO getUserDataDTO() {
		
		UserDataDTO userDataDTO = new UserDataDTO();
		
		userDataDTO.setName("Ruben Bonardi - Admin");
		userDataDTO.setUsername("arbonardi");
		userDataDTO.setEmail("ruben.bonardi@gmail.com.cl");
		userDataDTO.setPassword("arbonardi");
		
		UserPhonesDTO userPhonesDTO = new UserPhonesDTO();
		
		userPhonesDTO.setCityCode("BUE");
		userPhonesDTO.setCountryCode("AR");
		userPhonesDTO.setNumberPhone("+541130698383");
	
		List<UserPhonesDTO> userPhonesDTOList = new ArrayList<>();
		userPhonesDTOList.add(userPhonesDTO);
		userDataDTO.setPhones(userPhonesDTOList);	  

	    userDataDTO.setAppUserRoles(new ArrayList<UserRoleEntity>(Arrays.asList(UserRoleEntity.ROLE_ADMIN)));
	
		return userDataDTO;
		
	}

}
