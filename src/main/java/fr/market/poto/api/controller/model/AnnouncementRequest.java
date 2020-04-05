package fr.market.poto.api.controller.model;

import fr.market.poto.api.model.TypeAnnonce;
import fr.market.poto.api.model.TypeOffre;
import fr.market.poto.api.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@ApiModel
public class AnnouncementRequest {

    @Getter
    @Setter
    @ApiModelProperty(value = "id")
    Integer Id;

    @Getter @Setter
    @ApiModelProperty(value = "title")
    String title;

    @Getter @Setter
    @ApiModelProperty(value = "description")
    String description;

    @Getter @Setter
    @ApiModelProperty(value = "creationDate")
    LocalDateTime creationDate;

    @Getter @Setter
    @ApiModelProperty(value = "user")
    User user;

    @Getter @Setter
    @ApiModelProperty(value = "type annonce")
    TypeAnnonce typeAnnonce;

    @Getter @Setter
    @ApiModelProperty(value = "type offre")
    TypeOffre typeOffre;
}



