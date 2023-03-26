package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class BookRequest {

    @Getter @Setter
    Integer id;

    @Getter @Setter
    Double price;

    @Getter @Setter
    String title;

    @Getter @Setter
    Announcement announcement;

    @Getter @Setter
    List<ImageModel> imageModels;

    @Getter @Setter
    LocalDateTime purchaseDate;

    @Getter @Setter
    Classe classe;

    @Getter @Setter
    ClassePrimaire classePrimaire;

    @Getter @Setter
    Editeur editeur;

    @Getter @Setter
    BookCondition bookCondition;

    @Getter @Setter
    LevelOfStudies levelOfStudies;

    @Getter @Setter
    Course course;

}
