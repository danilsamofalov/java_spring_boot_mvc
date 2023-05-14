package com.main.springboot.service;


import com.main.springboot.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User findById(int id);
}
