package web.com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {
    
    @GetMapping("")
    public String accueil(){
        return "accueil";
    }
    
    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
}
