package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.CategoryRequest;
import fr.market.poto.api.controller.model.UserRequest;
import fr.market.poto.api.model.Category;
import fr.market.poto.api.model.User;
import org.springframework.stereotype.Service;

@Service
public class CategoryApiMapper {

    public Category convertCategoryRequest(CategoryRequest categoryRequest) {
        Category result = new Category();
        return result;
    }
}