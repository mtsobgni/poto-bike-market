package fr.market.poto.api.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", orphanRemoval = true)
    @Getter @Setter
    List<Announcement> announcementList;

}
