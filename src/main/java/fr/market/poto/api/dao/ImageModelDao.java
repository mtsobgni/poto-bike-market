package fr.market.poto.api.dao;

import fr.market.poto.api.model.ImageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageModelDao extends JpaRepository<ImageModel, Integer> {
}
