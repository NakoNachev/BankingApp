package nselect.BankingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String getLoginPage(@ModelAttribute ("user") Users user) {
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
	
	/**
	 * Validates registration, if user doesn't exist, pushes it into the database, otherwise rejects and 
	 * returns to the registration form
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("/checkRegistration")
	public String checkRegistration(Model model, @ModelAttribute("user") Users user) {
		return null;
		
		
	}

}

