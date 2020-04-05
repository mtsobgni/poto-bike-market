package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.UserRequest;
import fr.market.poto.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserApiMapper {

    public User convertUserRequest(UserRequest userRequest) {
        User result = new User();
        result.setUserName(userRequest.getUserName());
        result.setPassword(userRequest.getPassword());
        result.setLastLogin(userRequest.getLastLogin());
        result.setCreatedOn(userRequest.getCreatedOn());
        result.setEmail(userRequest.getEmail());
        result.setAnnouncementList(userRequest.getAnnouncementList());
        return result;
    }
}
