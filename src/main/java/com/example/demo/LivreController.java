package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivreController {
    @GetMapping("/")
    public String index(Model model) { // add `message`

        Livre l1 = new Livre("titre", "auteur", 11.90);

        model.addAttribute("livre", l1.toString());
        // return view name
        return "index";
    }
}
