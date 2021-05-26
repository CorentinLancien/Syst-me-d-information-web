package web.com.web.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.com.web.model.Utilisateur;
import web.com.web.service.UtilisateurService;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurRestController {
    
    @Autowired 
    UtilisateurService serviceUtilisateur;

    @PostMapping("")
    public boolean verifyConnexion(@RequestBody Utilisateur utilisateur){

        return this.serviceUtilisateur.verify(utilisateur.getUsername(), utilisateur.getPassword());
    }
}
