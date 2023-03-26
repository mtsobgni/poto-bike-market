package fr.market.poto.api.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Announcement {

    @Id
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;

    @Getter @Setter
     String title;

    @Getter @Setter
     String description;

    @Getter @Setter
    @Column( name = "creationdate")
     LocalDateTime creationDate;

    @Getter @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    User user;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    TypeAnnouncement typeAnnouncement;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    TypeOffre typeOffre;

}
