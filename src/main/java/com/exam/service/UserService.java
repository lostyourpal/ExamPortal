package com.exam.service;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;  //taking the user and the roles which a user can take at a time as parameters
    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);


}
