package web.com.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {
    
    @GetMapping("")
    public String accueil(HttpSession session){
        boolean connecte = false;
        String resultat = "login";
        if (connecte) {
            resultat="accueil";
        }
        return resultat;
    }
    
}
