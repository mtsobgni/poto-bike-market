package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.BookRequest;
import fr.market.poto.api.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookApiMapper {

    public Book convertArticleRequest(BookRequest bookRequest) {
        Book result = new Book();
        result.setAnnouncement(bookRequest.getAnnouncement());
        result.setTitle(bookRequest.getTitle());
        result.setImageModels(bookRequest.getImageModels());
        result.setPrice(bookRequest.getPrice());
        result.setClasse(bookRequest.getClasse());
        result.setClassePrimaire(bookRequest.getClassePrimaire());
        result.setCourse(bookRequest.getCourse());
        result.setEditeur(bookRequest.getEditeur());
        result.setBookCondition(bookRequest.getBookCondition());
        result.setLevelOfStudies(bookRequest.getLevelOfStudies());
        result.setPurchaseDate(bookRequest.getPurchaseDate());
        return result;
    }
}