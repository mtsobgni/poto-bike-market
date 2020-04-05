package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.AnnouncementApiMapper;
import fr.market.poto.api.controller.model.AnnouncementRequest;
import fr.market.poto.api.model.Announcement;
import fr.market.poto.api.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/announcement")
@RestController
public class AnnouncementController {

    @Autowired
    private AnnouncementService announcementService;

    @Autowired
    private AnnouncementApiMapper announcementApiMapper;

    @GetMapping(value = "/announcementId", produces = "application/json")
    public Announcement getAnnouncement (Integer id){
        return announcementService.getAnnouncementById(id);
    }

    @PostMapping(value = "/saveAnnouncement", produces = "application/json")
    public Announcement saveUser (@Valid @RequestBody AnnouncementRequest announcementRequest){
        return announcementService.saveAnnouncement(announcementApiMapper.convertAnnoucementRequest(announcementRequest));
    }

    @PutMapping(value = "/updateAnnouncement", produces = "application/json")
    public Announcement updateAnnouncement (Announcement announcement){
        return announcementService.updateAnnouncement(announcement);
    }

    @DeleteMapping(value = "/deleteAnnouncement", produces = "application/json")
    public void delete (Integer id){
        announcementService.deleteAnnouncement(id);
    }

}