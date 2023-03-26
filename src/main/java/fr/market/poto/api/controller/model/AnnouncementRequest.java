package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.TypeAnnouncement;
import fr.market.poto.api.model.TypeOffre;
import fr.market.poto.api.model.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class AnnouncementRequest {

    @Getter
    @Setter
    Integer Id;

    @Getter @Setter
    String title;

    @Getter @Setter
    String description;

    @Getter @Setter
    LocalDateTime creationDate;

    @Getter @Setter
    User user;

    @Getter @Setter
    TypeAnnouncement typeAnnouncement;

    @Getter @Setter
    TypeOffre typeOffre;
}



