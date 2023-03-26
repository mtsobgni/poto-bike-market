package fr.market.poto.api.controller.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class UserRequest {

    @Getter
    @Setter
    Integer Id;

    @Getter @Setter
    String userName;

    @Getter @Setter
    String password;

    @Getter @Setter
    String email;

    @Getter @Setter
    LocalDateTime createdOn;

    @Getter @Setter
    LocalDateTime lastLogin;

    /*@Getter @Setter
    @ApiModelProperty (value = "list announce")
    List<Announcement> announcementList;*/
}
