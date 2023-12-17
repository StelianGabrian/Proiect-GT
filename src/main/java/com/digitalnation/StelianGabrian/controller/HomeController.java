package com.digitalnation.StelianGabrian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.digitalnation.StelianGabrian.model.Chestionar;

@Controller
public class HomeController {
	
    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("home", new Chestionar());
        return "home";
    }
	
    @GetMapping("/produse")
    public String produsePage(Model model) {
        model.addAttribute("produse", new Chestionar());
        return "produse";
    }
    
	@GetMapping("/chestionar")
    public String chestionarForm(Model model) {
        model.addAttribute("chestionar", new Chestionar());
        return "chestionar";
    }
	    
    @GetMapping("/contact")
    public String contactPage(Model model) {
        model.addAttribute("contact", new Chestionar());
        return "contact";
    }

    @GetMapping("/feedback")
    public String feedbackPage(Model model) {
        model.addAttribute("feedback", new Chestionar());
        return "feedback";
    }

}
