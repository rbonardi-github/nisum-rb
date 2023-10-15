package nisum.users.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;


@Entity
@Data // Create getters and setters
@NoArgsConstructor
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(unique = true, nullable = false, length = 36)
  private String uuid;

  @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
  @Column(unique = true, nullable = false)
  private String username;
  
  @Column(nullable = false)
  private String name;
  
  @Column(unique = true, nullable = false)
  private String email;

  @Size(min = 8, message = "Minimum password length: 8 characters")
  private String password;
  
  @Column(nullable = false)
  private LocalDate createdDate;

  @Column(nullable = true)
  private LocalDate modifyDate;

  @Column(nullable = true)
  private LocalDate lastLogin;

  @Column(nullable = false)
  private Boolean isActive;
  
  @OneToMany(cascade = CascadeType.ALL)
  private List<UserPhonesEntity> phones;
  
  @ElementCollection(fetch = FetchType.EAGER)
  List<UserRoleEntity> appUserRoles;

}
