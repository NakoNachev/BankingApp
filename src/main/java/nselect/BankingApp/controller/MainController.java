package nselect.BankingApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nselect.BankingApp.entities.Users;

/**
 * Controller for the inner part of the app, meaning after the users logins
 * 
 * @author Asus
 *
 */
@Controller
@RequestMapping("/home")
public class MainController {
	
	/**
	 * Responsible for the main page after successful login
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("/preview")
	public String getMainView(Model model, @ModelAttribute ("user") Users user) {
		
		double currentBalance = user.getAccBalance();
		model.addAttribute("balance", currentBalance);
		
		return "preview";
	}
	
	
	

}
