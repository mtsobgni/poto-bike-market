package fr.market.poto.api.controller.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CategoryRequest {

    @Getter @Setter
    Integer id;
}
