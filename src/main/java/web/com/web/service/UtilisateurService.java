package web.com.web.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
            if(utilisateur.getUsername().equals(username) && utilisateur.getPassword().equals(password)){
                result = true;

                // SecurityContext sc = SecurityContextHolder.getContext();
                // sc.setAuthentication(auth);
                // HttpSession session = req.getSession(true);
                // session.setAttribute(SPRING_SECURITY_CONTEXT_KEY, sc);
            }
        }

        return result;
    }
    
}
