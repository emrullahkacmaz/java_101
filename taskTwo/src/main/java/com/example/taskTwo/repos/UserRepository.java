package com.example.taskTwo.repos;

import com.example.taskTwo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
