package web.com.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import web.com.web.model.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer>{
    
}
