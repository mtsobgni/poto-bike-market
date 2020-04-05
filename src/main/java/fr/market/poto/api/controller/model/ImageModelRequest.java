package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.Article;
import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@ApiModel
public class ImageModelRequest {

    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String type;

    @Getter @Setter
    private byte[] picBytes;

    @Getter @Setter
    Article article;
}