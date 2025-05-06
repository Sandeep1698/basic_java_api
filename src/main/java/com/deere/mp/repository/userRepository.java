package com.deere.mp.repository;

import com.deere.mp.enitities.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userRepository extends JpaRepository<userEntity,String> {

    List<userEntity> findAll();
    userEntity findByAccountId(String id);
    List<userEntity> findByCountryCode(String code);
}
