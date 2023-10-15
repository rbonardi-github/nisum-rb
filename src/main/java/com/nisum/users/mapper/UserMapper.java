package com.nisum.users.mapper;

import com.nisum.users.dto.UserDataDTO;
import com.nisum.users.dto.UserResponseDTO;
import com.nisum.users.entity.UserEntity;

public interface UserMapper {

    UserEntity userDataDtoToUserEntity (UserDataDTO userDataDTO);
    
    UserResponseDTO userEntityToUserResponseDTO (UserEntity userEntity);

}
