package springMvcWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/register")
public class Register {

	@RequestMapping("/test")
	public String register( Model model) {
		model.addAttribute("emp", new Register());
		return "register";
	}
}
