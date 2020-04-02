package fr.market.poto.api.service;

import fr.market.poto.api.dao.UserDao;
import fr.market.poto.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(){
        Optional<User> user = userDao.findById(1);
        return user.get();
    }

    public User saveUser() {
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("olk");
        user1.setCreatedOn(LocalDateTime.now());
        user1.setLastLogin(LocalDateTime.now());
        user1.setPassword("tryu");
        user1.setUserName("ertry");
        return user1 != null ? userDao.save(user1) : null;
    }
}
