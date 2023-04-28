package emp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( {"/employee"} )
@Controller
public class EmpController {
	List<Employee> emps = new ArrayList<Employee>();
	int empId = 1;
	@RequestMapping( {"/add"} )
	public String goToAdd(Model mv) {
		mv.addAttribute("emp", new Employee());
		return "/components/addEmp.jsp";
	}
	
	@RequestMapping( {"/addEmp"} )
	public String view(@ModelAttribute("emp") Employee e, Model mv) {
		e.setId(empId); empId++;
		emps.add(e);
		mv.addAttribute("emps", emps);
		return "/components/home.jsp";
	}
}
