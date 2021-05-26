package web.com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="UTI_ID", nullable = false)
    private int id;
    
    @Column(name="UTI_USERNAME", nullable = false, length = 20)
    private String username;

    @Column(name="UTI_NOM", nullable = false, length = 20)
    private String nom;

    @Column(name="UTI_PRENOM", nullable = false, length = 20)
    private String prenom;

    @Column(name="UTI_MAIL", nullable = false, length = 50)
    private String mail;

    @Column(name="UTI_PASSWORD", nullable = false, length = 20)
    private String password;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
