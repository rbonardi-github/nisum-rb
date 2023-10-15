package com.nisum.users.mapper.impl;

import lombok.AllArgsConstructor;
import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserPhonesDTO;
import com.nisum.users.dto.UserPhonesResponseDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.entity.UserEntity;
import com.nisum.users.entity.UserPhonesEntity;
import com.nisum.users.entity.UserRoleEntity;
import com.nisum.users.mapper.UserMapper;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class UserMapperImpl implements UserMapper {
	
	private final PasswordEncoder passwordEncoder;

    @Override
    public UserEntity userDataDtoToUserEntity (UserDataDTO userDataDTO) {

        UserEntity userEntity = new UserEntity();
        
        userEntity.setUuid(java.util.UUID.randomUUID().toString());
        userEntity.setUsername(userDataDTO.getUsername());
        userEntity.setPassword(passwordEncoder.encode(userDataDTO.getPassword()));
        userEntity.setName(userDataDTO.getName());
        userEntity.setEmail(userDataDTO.getEmail());
        userEntity.setIsActive(Boolean.TRUE);
        userEntity.setCreatedDate(LocalDate.now());
        userEntity.setModifyDate(LocalDate.now());
        userEntity.setLastLogin(LocalDate.now());
        
        List<UserPhonesEntity> userPhonesEntityList = new ArrayList<>();

		for (UserPhonesDTO phone : userDataDTO.getPhones()) {
			UserPhonesEntity userPhonesEntity = new UserPhonesEntity();
			
			userPhonesEntity.setNumberPhone(phone.getNumberPhone());
			userPhonesEntity.setCityCode(phone.getCityCode());
			userPhonesEntity.setCountryCode(phone.getCountryCode());
			
			userPhonesEntityList.add(userPhonesEntity);
		}
		
		userEntity.setPhones(userPhonesEntityList);
		
		List<UserRoleEntity> userRoleEntityList = userDataDTO.getAppUserRoles();		
		
		userEntity.setAppUserRoles(userRoleEntityList);
        
        return userEntity;
    }

    @Override
    public UserResponseDTO userEntityToUserResponseDTO (UserEntity userEntity) {

    	UserResponseDTO userResponseDTO = new UserResponseDTO();
        
    	userResponseDTO.setId(userEntity.getId());
    	userResponseDTO.setUuid(userEntity.getUuid());
    	userResponseDTO.setUsername(userEntity.getUsername());
    	userResponseDTO.setName(userEntity.getName());
    	userResponseDTO.setEmail(userEntity.getEmail());
    	userResponseDTO.setIsActive(userEntity.getIsActive());
    	userResponseDTO.setCreatedDate(userEntity.getCreatedDate());
    	userResponseDTO.setModifyDate(userEntity.getModifyDate());
    	userResponseDTO.setLastLogin(userEntity.getLastLogin());
        
        List<UserPhonesResponseDTO> userPhonesDtoList = new ArrayList<>();

		for (UserPhonesEntity phone : userEntity.getPhones()) {
			UserPhonesResponseDTO userPhonesResponseDTO = new UserPhonesResponseDTO();
			
			userPhonesResponseDTO.setNumberPhone(phone.getNumberPhone());
			userPhonesResponseDTO.setCityCode(phone.getCityCode());
			userPhonesResponseDTO.setCountryCode(phone.getCountryCode());
			
			userPhonesDtoList.add(userPhonesResponseDTO);
		}
		
		userResponseDTO.setPhones(userPhonesDtoList);
		userResponseDTO.setAppUserRoles(userEntity.getAppUserRoles());
        
        
        return userResponseDTO;
    }
}
