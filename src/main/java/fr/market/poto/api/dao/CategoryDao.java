package fr.market.poto.api.dao;

import fr.market.poto.api.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
