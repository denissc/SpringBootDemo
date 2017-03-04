package com.example.services;


import com.example.models.User;

public interface UserService {
    public User findByUsername(String email);
    public void save(User user);
}
