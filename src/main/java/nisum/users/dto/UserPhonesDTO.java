package nisum.users.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserPhonesDTO {
  
	  @ApiModelProperty(position = 0)
	  private String numberPhone;
	  
	  @ApiModelProperty(position = 1)
	  private String cityCode;
	  
	  @ApiModelProperty(position = 2)
	  private String countryCode;

}
