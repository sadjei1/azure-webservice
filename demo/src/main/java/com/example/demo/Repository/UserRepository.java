package com.example.demo.Repository;

import com.example.demo.User.User;
import org.springframework.data.jpa.repository.JpaRepository;


/*
UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
