package ImageBl.demo.ServiceImage;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service

public interface ImageService {
     public String uploadImage(MultipartFile file) throws IOException ;
     public byte[] downloadImage(String fileName);
}
