package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.AnnouncementRequest;
import fr.market.poto.api.model.Announcement;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementApiMapper {

    public Announcement convertAnnoucementRequest(AnnouncementRequest announcementRequest) {
        Announcement result = new Announcement();
        result.setTitle(announcementRequest.getTitle());
        result.setDescription(announcementRequest.getDescription());
        result.setCreationDate(announcementRequest.getCreationDate());
        result.setTypeAnnouncement(announcementRequest.getTypeAnnouncement());
        result.setTypeOffre(announcementRequest.getTypeOffre());
        result.setUser(announcementRequest.getUser());
        return result;
    }
}
