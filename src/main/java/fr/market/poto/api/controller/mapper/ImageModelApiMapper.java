package fr.market.poto.api.controller.mapper;

import fr.market.poto.api.controller.model.ImageModelRequest;
import fr.market.poto.api.model.ImageModel;
import org.springframework.stereotype.Service;

@Service
public class ImageModelApiMapper {

    public ImageModel convertImgRequestRequest(ImageModelRequest imageModelRequest) {
        ImageModel result = new ImageModel();
        result.setName(imageModelRequest.getName());
        result.setType(imageModelRequest.getType());
        result.setBook(imageModelRequest.getBook());
        result.setPicBytes(imageModelRequest.getPicBytes());
        return result;
    }
}
