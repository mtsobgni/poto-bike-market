package fr.market.poto.api.dao;

import fr.market.poto.api.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDao extends JpaRepository<Article, Integer> {
}
