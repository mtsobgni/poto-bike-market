package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.*;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@ApiModel
public class ArticleRequest {

    @Getter @Setter
    Integer id;

    @Getter @Setter
    Double price;

    @Getter @Setter
    String description;

    @Getter @Setter
    Announcement announcement;

    @Getter @Setter
    List<ImageModel> imageModels;

    @Getter @Setter
    Category category;
}
