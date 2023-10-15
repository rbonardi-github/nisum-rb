package com.nisum.users.entity;

import org.springframework.security.core.GrantedAuthority;

public enum UserRoleEntity implements GrantedAuthority {
  ROLE_ADMIN, ROLE_CLIENT;

  public String getAuthority() {
    return name();
  }

}
