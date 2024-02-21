package ImageBl.demo.ServiceUser;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import ImageBl.demo.Dto.UserDto;
import ImageBl.demo.Entities.User;
@Service
public interface UserService extends UserDetailsService{
    public User save(UserDto userDtoDto);
    
}
