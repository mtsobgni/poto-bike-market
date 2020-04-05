package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.Announcement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@ApiModel
public class UserRequest {

    @Getter
    @Setter
    @ApiModelProperty (value = "id user")
    Integer Id;

    @Getter @Setter
    @ApiModelProperty (value = "user name")
    String userName;

    @Getter @Setter
    @ApiModelProperty (value = "password")
    String password;

    @Getter @Setter
    @ApiModelProperty (value = "email")
    String email;

    @Getter @Setter
    @ApiModelProperty (value = "create date")
    LocalDateTime createdOn;

    @Getter @Setter
    @ApiModelProperty (value = "lastlogin date")
    LocalDateTime lastLogin;

    @Getter @Setter
    @ApiModelProperty (value = "list announce")
    List<Announcement> announcementList;
}
