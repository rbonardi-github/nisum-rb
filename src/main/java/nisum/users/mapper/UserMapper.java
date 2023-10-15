package nisum.users.mapper;

import nisum.users.dto.UserDataDTO;
import nisum.users.dto.UserResponseDTO;
import nisum.users.entity.UserEntity;

public interface UserMapper {

    UserEntity userDataDtoToUserEntity (UserDataDTO userDataDTO);
    
    UserResponseDTO userEntityToUserResponseDTO (UserEntity userEntity);

}
