package fr.market.poto.api.service;

import fr.market.poto.api.dao.UserDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(Integer user_id){
        Optional<User> result = userDao.findById(user_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public User updateUser(User updateUser){
        User user = userDao.findById(updateUser.getId()).get();
        if(user != null){
            user = userDao.save(updateUser);
        }
        return user;
    }

    public void deleteUser (Integer user_id){
        if(userDao.findById(user_id).get() != null){
            userDao.deleteById(user_id);
        }
        else{
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}
