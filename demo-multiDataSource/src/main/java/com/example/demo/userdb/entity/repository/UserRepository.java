package com.example.demo.userdb.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.userdb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
