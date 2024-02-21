package ImageBl.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ImageBl.demo.Entities.User;

public interface UserRepo  extends JpaRepository<User,Long>{
    User findByEmail(String email);
    
}
