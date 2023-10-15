package nisum.users.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import nisum.users.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {

  boolean existsByUsername(String username);
  
  boolean existsByEmail(String email);

  UserEntity findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

}
