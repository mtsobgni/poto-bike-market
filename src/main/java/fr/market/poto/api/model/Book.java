package fr.market.poto.api.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
     Integer id;

    @Getter @Setter
     Double price;

    @Getter @Setter
     String title;

    @Getter @Setter
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn( referencedColumnName = "id")
    Announcement announcement;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
    @Getter @Setter
    List<ImageModel> imageModels;

    @Getter @Setter
    @Column( name = "purchase_date")
    LocalDateTime purchaseDate;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    Classe classe;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column( name = "classe_primaire")
    ClassePrimaire classePrimaire;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    Editeur editeur;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column( name = "book_condition")
    BookCondition bookCondition;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    @Column( name = "level_of_studies")
    LevelOfStudies levelOfStudies;

    @Getter @Setter
    @Enumerated(EnumType.STRING)
    Course course;

}
