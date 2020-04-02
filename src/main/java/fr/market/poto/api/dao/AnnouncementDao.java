package fr.market.poto.api.dao;

import fr.market.poto.api.model.Announcement;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AnnouncementDao extends JpaRepository<Announcement, Integer> {
}
