package nselect.BankingApp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import nselect.BankingApp.entities.Users;
import nselect.BankingApp.services.UsersService;

/**
 * Controller for the inner part of the app, meaning after the user logins
 * 
 * @author Asus
 *
 */
@Controller
@RequestMapping("/home")
public class MainController {
	
	@Autowired
	UsersService usersService;
	
	
	@RequestMapping("/preview")
	public String getMainView(Model model, @ModelAttribute ("user") Users user) {
		
		double currentBalance = user.getAccBalance();
		model.addAttribute("balance", currentBalance);
		
		return "preview";
	}
	
	@RequestMapping("/preview/deposit")
	public String returnDepositForm() {
		
		return "depositForm";
	}
	
	@RequestMapping("/preview/deposit/depositConfirmation")
	public String deposit(HttpServletRequest request, @ModelAttribute ("user") Users user) {
		
		Users currentUser = usersService.findByUsername(user.getUsername());
		
		double deposit_amount = Double.parseDouble(request.getParameter("deposit_amount"));
		
		currentUser.setAccBalance(deposit_amount);
		usersService.update(currentUser);

		return "deposit_confirmation";
	}
	
	@RequestMapping("/preview/withdraw")
	public String withdraw() {
		
		return null;
	}
	
	@RequestMapping("/preview/viewTransactions")
	public String viewTransactions() {
		
		return null;
	}
	
	@RequestMapping("/preview/transfer")
	public String transfer() {
		
		return null;
	}
	
	
	
	
	

}
