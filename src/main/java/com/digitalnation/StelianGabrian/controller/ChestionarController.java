package com.digitalnation.StelianGabrian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.digitalnation.StelianGabrian.model.Chestionar;
import com.digitalnation.StelianGabrian.repository.ChestionarRepository;


@Controller
public class ChestionarController {
    @Autowired
    ChestionarRepository repoChestionar;

		
	 @PostMapping("/chestionar")
	    public String chestionarToDataBase(@ModelAttribute Chestionar chestionar, Model model) {
	        model.addAttribute("chestionar", chestionar);
	        repoChestionar.save(chestionar);
	        return "redirect:/feedback";
	    }
}

