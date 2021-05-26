package web.com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import web.com.web.dao.UtilisateurDao;


@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private UtilisateurDao daoUtilisateur;


    @GetMapping("")
    public String login(){
        return "login";
    }
}
