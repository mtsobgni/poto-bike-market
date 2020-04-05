package fr.market.poto.api.service;

import fr.market.poto.api.dao.AnnouncementDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class AnnouncementService {

    @Autowired
    private AnnouncementDao announcementDao;

    public Announcement getAnnouncementById(Integer announcement_id){
        Optional<Announcement> result = announcementDao.findById(announcement_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public Announcement saveAnnouncement(Announcement announcement) {
        return announcementDao.save(announcement);
    }

    public Announcement updateAnnouncement(Announcement updateAnnouncement){
        Announcement announcement = announcementDao.findById(updateAnnouncement.getId()).get();
        if(announcement != null){
            announcement = announcementDao.save(updateAnnouncement);
        }
        return announcement;
    }

    public void deleteAnnouncement (Integer announcement_id){
        if(announcementDao.findById(announcement_id).get() != null){
            announcementDao.deleteById(announcement_id);
        }
        else{
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}

