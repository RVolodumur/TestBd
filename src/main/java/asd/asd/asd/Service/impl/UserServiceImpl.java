package asd.asd.asd.Service.impl;

import asd.asd.asd.Dao.UserDao;
import asd.asd.asd.Entity.User;

import asd.asd.asd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(String userName, String phone, String email, String password) {
        if (!userName.isEmpty() && !phone.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
            User user = new User(userName, phone, email, password);
            userDao.save(user);

        }
    }

    public User findOne(int id) {
        return userDao.findOne(id);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void delete(int id) {
        userDao.delete(id);
    }


    public void save(User user) {

        System.out.println("service");
        userDao.save(user);
    }

    public User findOne(String name) {
        return  userDao.findOne(name);
    }

}

