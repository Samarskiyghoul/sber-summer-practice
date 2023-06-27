package com.example.servingwebcontent.repos;

import com.example.servingwebcontent.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
