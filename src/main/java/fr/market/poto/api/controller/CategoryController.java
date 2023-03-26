package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.CategoryApiMapper;
import fr.market.poto.api.controller.model.CategoryRequest;
import fr.market.poto.api.model.Category;
import fr.market.poto.api.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/category")
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryApiMapper categoryApiMapper;

    @GetMapping(value = "/categoryId", produces = "application/json")
    public Category getCategory (Integer id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping(value = "/saveCategory", produces = "application/json")
    public Category saveCategory (@Valid @RequestBody CategoryRequest categoryRequest){
        return categoryService.saveCategory(categoryApiMapper.convertCategoryRequest(categoryRequest));
    }

    @PutMapping(value = "/updateCategory", produces = "application/json")
    public Category updateCategory (Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping(value = "/deleteCategory", produces = "application/json")
    public void delete(Integer id) {
        categoryService.deleteCategory(id);
    }

}