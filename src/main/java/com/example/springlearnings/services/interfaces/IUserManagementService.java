package com.example.springlearnings.services.interfaces;

import com.example.springlearnings.entity.Journal;
import com.example.springlearnings.entity.User;
import com.example.springlearnings.services.errorhandling.exceptions.UserAlreadyExistException;
import com.example.springlearnings.services.errorhandling.exceptions.UserDoesNotExistException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserManagementService {
    List<User> getAllUsers();
    User getUserByUserName(String username);
    void createUser(User user) throws UserAlreadyExistException;
    void deleteUser(String username);
}
