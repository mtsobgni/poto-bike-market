package fr.market.poto.api.controller;

import fr.market.poto.api.controller.mapper.ImageModelApiMapper;
import fr.market.poto.api.controller.model.ImageModelRequest;
import fr.market.poto.api.model.ImageModel;
import fr.market.poto.api.service.ImageModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping(path = "/image")
@RestController
public class ImageModelController {

    @Autowired
    private ImageModelService imageModelService;

    @Autowired
    private ImageModelApiMapper imageModelApiMapper;

    @GetMapping(value = "/ImageId", produces = "application/json")
    public ImageModel getImage (Integer id){
        return imageModelService.getImageModelById(id);
    }

    @PostMapping(value = "/saveImage", produces = "application/json")
    public ImageModel saveImage (@Valid @RequestBody ImageModelRequest imageModelRequest){
        return imageModelService.saveImgModel(imageModelApiMapper.convertImgRequestRequest(imageModelRequest));
    }

    @PutMapping(value = "/updateImage", produces = "application/json")
    public ImageModel updateImage (ImageModel imageModel){
        return imageModelService.updateImgModel(imageModel);
    }

    @DeleteMapping(value = "/deleteImage", produces = "application/json")
    public void deleteImage (Integer id){
        imageModelService.deleteImgModel(id);
    }
}