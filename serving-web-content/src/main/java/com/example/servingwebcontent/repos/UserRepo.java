package com.example.servingwebcontent.repos;

import com.example.servingwebcontent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User, Long>{
    User findByName(String name);
}
