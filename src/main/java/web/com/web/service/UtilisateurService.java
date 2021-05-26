package web.com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.com.web.dao.UtilisateurDao;
import web.com.web.model.Utilisateur;

@Service
public class UtilisateurService {
    
    @Autowired
    private UtilisateurDao daoUtilisateur;

    public boolean verify(String username, String password){
        boolean result = false;
        for (Utilisateur utilisateur : this.daoUtilisateur.findAll()) {
            if(utilisateur.getUsername().equals(username)){
                if(utilisateur.getPassword().equals(password)){
                    result = true;
                }
            }
        }

        return result;
    }
    
}
