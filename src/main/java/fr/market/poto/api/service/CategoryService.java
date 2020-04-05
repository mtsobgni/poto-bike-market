package fr.market.poto.api.service;

import fr.market.poto.api.dao.CategoryDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public Category getCategoryById(Integer category_id){
        Optional<Category> result = categoryDao.findById(category_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public Category saveCategory(Category category) {
        return categoryDao.save(category);
    }

    public Category updateCategory(Category updateCategory){
        Category category = categoryDao.findById(updateCategory.getId()).get();
        if(category != null){
            category = categoryDao.save(updateCategory);
        }
        return category;
    }

    public void deleteCategory (Integer category_id){
        if(categoryDao.findById(category_id).get() != null){
            categoryDao.deleteById(category_id);
        }
        else{
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}

