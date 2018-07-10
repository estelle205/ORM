package net.joastbg.sampleapp.entities;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    private int id;
    @Column
    private String type;
    @Column
    private String valeur;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
