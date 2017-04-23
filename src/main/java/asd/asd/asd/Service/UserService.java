package asd.asd.asd.Service;


import asd.asd.asd.Entity.User;

import java.util.List;

public interface UserService {
    public void save(String userName, String phone, String email, String password);
    public User findOne(int id);
    public List<User> findAll();
    public void delete(int id);
    public void save(User user);
    public User findOne(String name);
}