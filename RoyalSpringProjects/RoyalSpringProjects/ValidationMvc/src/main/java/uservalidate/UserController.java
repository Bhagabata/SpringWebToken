package uservalidate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@RequestMapping( {"/user"} )
@Controller
public class UserController {
	
	@RequestMapping( {"/reg"} )
	public String getUser(Model m) {
		m.addAttribute("user", new User());
		return "/uservalidation/userDataForm.jsp";
	}
	
	@RequestMapping( {"/validate"} )
	public String validate(@Valid @ModelAttribute("user") User u, BindingResult br) {
		
		if(br.hasErrors()) {
			return "/uservalidation/userDataForm.jsp";		
		} else {
			return "/uservalidation/home.jsp";			
		}
	}
	
}
