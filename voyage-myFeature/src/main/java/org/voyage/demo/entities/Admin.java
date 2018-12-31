package org.voyage.demo.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ID")

public class Admin extends User{

    private String motDePasse ;

    public Admin(String nom, String prenom, String email, String telephone,String motDePasse) {
        super(nom, prenom, email, telephone);
        this.motDePasse = motDePasse;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
