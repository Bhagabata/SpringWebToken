package customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@RequestMapping( {"/cust"} )
@Controller
public class CustomerController {

	@RequestMapping( {"/getdata"} )
	public String getData(Model m) {
		m.addAttribute("cust", new Customer());
		return "/customersales/customerSalesForm.jsp";
	}
	
	@RequestMapping( {"/validate"} )
	public String validateCust(@Valid @ModelAttribute("cust") Customer c, BindingResult br) {
		if(br.hasErrors()) {
			return "/customersales/customerSalesForm.jsp"; 
		} else {
			return "/customersales/home.jsp";			
		}

	}
}
