package fr.market.poto.api.service;

import fr.market.poto.api.dao.ImageModelDao;
import fr.market.poto.api.dao.UserDao;
import fr.market.poto.api.exception.FunctionalExceptionConstants;
import fr.market.poto.api.model.ImageModel;
import fr.market.poto.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@Service
public class ImageModelService {

    @Autowired
    private ImageModelDao imageModelDao;

    public ImageModel getImageModelById(Integer ImgModel_id){
        Optional<ImageModel> result = imageModelDao.findById(ImgModel_id);
        if(!result.isPresent())
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        return result.get();
    }

    public ImageModel saveImgModel(ImageModel imageModel) {
        return imageModelDao.save(imageModel);
    }

    public ImageModel updateImgModel(ImageModel updateImgModel){
        ImageModel imageModel = imageModelDao.findById(updateImgModel.getId()).get();
        if(imageModel != null){
            imageModel = imageModelDao.save(updateImgModel);
        }
        return imageModel;
    }

    public void deleteImgModel (Integer imgModel_id){
        if(imageModelDao.findById(imgModel_id).get() != null){
            imageModelDao.deleteById(imgModel_id);
        }
        else{
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND, FunctionalExceptionConstants.Error.INVALID_VALUE);
        }
    }
}

