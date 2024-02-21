package ImageBl.demo.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ImageBl.demo.Entities.Image;


public interface ImageRepo extends JpaRepository<Image,Long>{
    Optional<Image> findByName(String fileName);
    
}
