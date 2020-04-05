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
@Table (name = "user_poto")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
     Integer Id;

    @Column(name = "username")
    @Getter @Setter
     String userName;

    @Getter @Setter
     String password;

    @Getter @Setter
     String email;

    @Column(name = "created_on")
    @Getter @Setter
     LocalDateTime createdOn;

    @Column(name = "last_login")
    @Getter @Setter
     LocalDateTime lastLogin;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", orphanRemoval = true)
    @Getter @Setter
    List<Announcement> announcementList;

}
