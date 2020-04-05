package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.ArticleApiMapper;
import fr.market.poto.api.controller.mapper.UserApiMapper;
import fr.market.poto.api.controller.model.ArticleRequest;
import fr.market.poto.api.controller.model.UserRequest;
import fr.market.poto.api.model.Article;
import fr.market.poto.api.model.User;
import fr.market.poto.api.service.ArticleService;
import fr.market.poto.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/article")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private ArticleApiMapper articleApiMapper;

    @GetMapping(value = "/articleId", produces = "application/json")
    public Article getArticle (Integer article_id){
        return articleService.getArticleById(article_id);
    }

    @PostMapping(value = "/saveArticle", produces = "application/json")
    public Article saveArticle (@Valid @RequestBody ArticleRequest articleRequest){
        return articleService.saveArticle(articleApiMapper.convertArticleRequest(articleRequest));
    }

    @PutMapping(value = "/updateArticle", produces = "application/json")
    public Article updateArticle (Article article){
        return articleService.updateArticle(article);
    }

    @DeleteMapping(value = "/deleteArticle", produces = "application/json")
    public void deleteArticle (Integer id){
        articleService.deleteArticle(id);
    }
}