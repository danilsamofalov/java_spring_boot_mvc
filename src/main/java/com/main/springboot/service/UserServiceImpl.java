package com.main.springboot.service;


import com.main.springboot.repository.UserRepository;
import com.main.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }

    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        userRepository.save( user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void removeUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(int id) {
        User user = null;
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
        }
        return user;
    }
}
