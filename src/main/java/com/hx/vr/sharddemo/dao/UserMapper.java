package com.hx.vr.sharddemo.dao;

import com.hx.vr.sharddemo.model.User;

import java.util.List;

public interface UserMapper {
 
    void addUser(User user);
 
    List<User> getUsers();
 
}