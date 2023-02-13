package ru.borisov.crud_mvc.services;

import ru.borisov.crud_mvc.models.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    List<User> getAllUsers();
    User userInfo(int id);
    void updateUser(User user);

    void deleteUser(int id);
}
