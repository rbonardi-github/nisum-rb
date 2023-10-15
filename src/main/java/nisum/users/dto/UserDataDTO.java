package nisum.users.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import nisum.users.entity.UserPhonesEntity;
import nisum.users.entity.UserRoleEntity;

@Data
@NoArgsConstructor
public class UserDataDTO {
  
  @ApiModelProperty(position = 0)
  private String name;
  
  @ApiModelProperty(position = 1)
  private String username;
  
  @ApiModelProperty(position = 2)
  private String email;
  
  @ApiModelProperty(position = 3)
  private String password;
  
  @ApiModelProperty(position = 4)
  private List<UserPhonesDTO> phones;
  
  @ApiModelProperty(position = 5)
  List<UserRoleEntity> appUserRoles;

}
