package net.joastbg.sampleapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AssuranceHabitat extends Assurance{

    private int id;
    private String adresse;
    private double couverture;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getCouverture() {
        return couverture;
    }

    public void setCouverture(double couverture) {
        this.couverture = couverture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
