package ImageBl.demo.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ImageBl.demo.Dto.UserDto;
import ImageBl.demo.ServiceUser.UserService;
@Controller
@RequestMapping("/registration")
public class UserController {



    private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserDto userDto){
		userService.save(userDto);
		return "redirect:/registration?success";
	}
    
}
