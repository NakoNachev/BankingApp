package nselect.BankingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nselect.BankingApp.entities.Users;
import nselect.BankingApp.services.UsersService;


/**
 * Controller for the login/register part of the app.
 * @author Asus
 *
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private UsersService usersService;
	
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
	public String getRegisterPage(@ModelAttribute ("user") Users user) {
		return "register_page";
		
	}
	
	@RequestMapping("/successfulLogin")
	public String confirmLogin(Model model, @ModelAttribute ("user") Users user) {
		
		//TODO:check for user existance
		//hash login password
		
		String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());

		if(BCrypt.checkpw(user.getPassword(), hashedPassword)) {
			return "login_confirmation";
		}
		else {
			model.addAttribute("wrongPasswordMessage","The entered password is not correct");
			return "login_page";
		}

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
		
		List<Users> currentUsers = usersService.findAll();
		boolean userExists = false;
		for (int index=0; index< currentUsers.size(); index++) {
			if(currentUsers.get(index).getUsername().equals(user.getUsername())){
				userExists = true;
			}
		}
		
		if(userExists) {
			//inform user for already existing user
			model.addAttribute("message","User already exists!");
			return "register_page";
		}
		else {
			//generate salt for hashing and store the hashed pw in database
			String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
			user.setPassword(hashedPassword);
			usersService.persist(user);
			return "register_confirmation";
		}
		
		
		
	}

}

