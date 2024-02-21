package ImageBl.demo.ServiceImage;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ImageBl.demo.Entities.Image;
import ImageBl.demo.Repositories.ImageRepo;

@Service

public class ImageServiceImpl implements ImageService{

   @Autowired
   private ImageRepo imageRepo;

    @SuppressWarnings({ "null", "unused" })
    public String uploadImage(MultipartFile file) throws IOException {

        Image imageData = imageRepo.save(Image.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .imageData(ImageUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String fileName){
        Optional<Image> dbImageData = imageRepo.findByName(fileName);
        byte[] images=ImageUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
    
}
