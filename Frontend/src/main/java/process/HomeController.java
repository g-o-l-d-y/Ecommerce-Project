package process;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import process.Model.User;

@Controller
public class HomeController {

	@RequestMapping(value= {"/Home","/"})
	public String showHome()
	{
		return "Home";
	}
	
	@RequestMapping(value= "/UserHome")
	public String showUserHome()
	{
		return "UserHome";
	}
	
	@RequestMapping(value= "/AdminHome")
	public String showAdminHome()
	{
		return "AdminHome";
	}
	
	@RequestMapping("/Login") 
	public String showlogin() 
	{ 
		return "Login"; 
	}
	
	@RequestMapping("/Supplier")
	public String showSupplier()
	{
		return "Supplier";
	}
	
	@RequestMapping(value="Register", method=RequestMethod.GET) 
	public String showRegister(Map<String, Object> model) 
	{
		model.put("user", new User());
		return "Register"; 
	}
	
	@RequestMapping("/ContactUs")
	public String showContactUs()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	}
}
