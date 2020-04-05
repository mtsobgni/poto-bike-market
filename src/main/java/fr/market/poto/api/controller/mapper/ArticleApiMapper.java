package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.ArticleRequest;
import fr.market.poto.api.model.Article;
import org.springframework.stereotype.Service;

@Service
public class ArticleApiMapper {

    public Article convertArticleRequest(ArticleRequest articleRequest) {
        Article result = new Article();
        result.setAnnouncement(articleRequest.getAnnouncement());
        result.setDescription(articleRequest.getDescription());
        result.setCategory(articleRequest.getCategory());
        result.setImageModels(articleRequest.getImageModels());
        result.setPrice(articleRequest.getPrice());
        return result;
    }
}