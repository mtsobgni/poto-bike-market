package fr.market.poto.api.controller.model;

import io.swagger.annotations.ApiModel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@ApiModel
public class CategoryRequest {

    @Getter @Setter
    Integer id;
}
