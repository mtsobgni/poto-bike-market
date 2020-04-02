package fr.market.poto.api.controller;

import fr.market.poto.api.model.User;
import fr.market.poto.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/userId", produces = "application/json")
    public User getUser (){
        //@RequestParam(value = "userId") Integer id
        return userService.getUser();
    }

    @PostMapping(value = "/save", produces = "application/json")
    public User saveUser (){
        //@RequestParam(value = "userId") User user
        return userService.saveUser();
    }
}
