package nisum.users.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import nisum.users.entity.UserPhonesEntity;
import nisum.users.entity.UserRoleEntity;

@Data
public class UserResponseDTO {

  @ApiModelProperty(position = 0)
  private Integer id;
  
  @ApiModelProperty(position = 1)
  private String uuid;
  
  @ApiModelProperty(position = 2)
  private String name;
  
  @ApiModelProperty(position = 3)
  private String username;
  
  @ApiModelProperty(position = 4)
  private String email;
  
  @ApiModelProperty(position = 5)
  private Boolean isActive;
  
  @ApiModelProperty(position = 6)
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDate createdDate;

  @ApiModelProperty(position = 7)
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDate modifyDate;

  @ApiModelProperty(position = 8)
  @JsonFormat(shape = JsonFormat.Shape.STRING)
  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  private LocalDate lastLogin;
  
  @ApiModelProperty(position = 9)
  private List<UserPhonesResponseDTO> phones;
  
  @ApiModelProperty(position = 10)
  List<UserRoleEntity> appUserRoles;
  
  @ApiModelProperty(position = 11)
  private String token;

}
