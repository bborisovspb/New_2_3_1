package ru.borisov.crud_mvc.dao;

import ru.borisov.crud_mvc.models.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> getAllUsers();
    User userInfo(int id);
    void updateUser(User user);
    void deleteUser(int id);

}
