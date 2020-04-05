package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.UserApiMapper;
import fr.market.poto.api.controller.model.UserRequest;
import fr.market.poto.api.model.User;
import fr.market.poto.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserApiMapper userApiMapper;

    @GetMapping(value = "/userId", produces = "application/json")
    public User getUser (Integer user_id){
        return userService.getUserById(user_id);
    }

    @PostMapping(value = "/saveUser", produces = "application/json")
    public User saveUser (@Valid @RequestBody UserRequest userRequest){
        return userService.saveUser(userApiMapper.convertUserRequest(userRequest));
    }

    @PutMapping(value = "/update", produces = "application/json")
    public User updateUser (User user){
        return userService.updateUser(user);
    }

    @DeleteMapping(value = "/delete", produces = "application/json")
    public void deleteUser (Integer userId){
         userService.deleteUser(userId);
    }
}
