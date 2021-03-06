package com.greenfoxacademy.banksimba.controller;

import com.greenfoxacademy.banksimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BankSimbaController {

	@RequestMapping(value = "/exercise1")
	public String createAccount(Model model) {
		BankAccount account = new BankAccount("Simba", 2000, "lion", true, "Good Guy");
		model.addAttribute("account", account);
		return "exercise1";
	}

	@RequestMapping(value = "/htmlception")
	public String htmlception(Model model) {
		String stringToCheck = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
		model.addAttribute("string", stringToCheck);
		return "htmlception";
	}

	@GetMapping(value = "/bank")
	public String bank(Model model) {
		List<BankAccount> bank = new ArrayList<>();
		bank.add(new BankAccount("Simba", 2000, "lion", true, "Good Guy"));
		bank.add(new BankAccount("Zordon", 3000, "lion", false, "Bad Guy"));
		bank.add(new BankAccount("Rafiki", 5000, "monkey", false, "Good Guy"));
		bank.add(new BankAccount("Zazu", 1000, "bird", false, "Good Guy"));
		bank.add(new BankAccount("Timon", 3500, "other", false, "Good Guy"));
		model.addAttribute("list", bank);
		return "bank";
	}

	@PostMapping(value = "/bank")
	public String setBalance(@ModelAttribute List<BankAccount> bank) {
		for (BankAccount b : bank) {
			b.setBalance(5000);
		}
		return "bank";
	}
}
