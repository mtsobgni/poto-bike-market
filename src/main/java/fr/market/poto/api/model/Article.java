package fr.market.poto.api.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
     Integer id;

    @Getter @Setter
     Double price;

    @Getter @Setter
     String description;

    @Getter @Setter
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( referencedColumnName = "id")
    Announcement announcement;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article")
    @Getter @Setter
    List<ImageModel> imageModels;

    @Getter @Setter
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( referencedColumnName = "id")
    Category category;
}
