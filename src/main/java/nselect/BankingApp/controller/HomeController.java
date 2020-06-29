package nselect.BankingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import nselect.BankingApp.entities.Users;


/**
 * Controller for the login/register part of the app.
 * @author Asus
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/")
	public String getStartingPage(Model model) {
		
		//create new user object to be used as a modelAttribute upon login
		Users user = new Users();
		model.addAttribute("user",user);		
		return "home";
		
	}
	
	@RequestMapping("/login")
	public String getLoginPage() {
		return "login_page";
		
		
	}
	
	@RequestMapping("/register")
	public String getRegisterPage() {
		return "register_page";
		
	}
	
	@RequestMapping("/successfulLogin")
	public String confirmLogin() {
		return "login_confirmation";
	}

}

