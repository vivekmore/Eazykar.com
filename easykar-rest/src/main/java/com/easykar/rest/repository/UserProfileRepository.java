package com.easykar.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easykar.rest.controller.entity.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    //  UserProfile findByUserid(long user_ID);
    
    UserProfile findByuserid(Long Id);
}
