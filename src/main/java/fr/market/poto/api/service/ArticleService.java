package fr.market.poto.api.service;

import fr.market.poto.api.dao.ArticleDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public Article getArticleById(Integer article_id){
        Optional<Article> result = articleDao.findById(article_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public Article saveArticle(Article article) {
        return articleDao.save(article);
    }

    public Article updateArticle(Article updateArticle){
        Article article = articleDao.findById(updateArticle.getId()).get();
        if(article != null){
            article = articleDao.save(updateArticle);
        }
        return article;
    }

    public void deleteArticle (Integer article_id){
        if(articleDao.findById(article_id).get() != null){
            articleDao.deleteById(article_id);
        }
        else{
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}