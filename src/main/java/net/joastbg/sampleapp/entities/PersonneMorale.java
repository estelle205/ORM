package net.joastbg.sampleapp.entities;

import javax.persistence.*;

@Entity
public class PersonneMorale extends Client {
    private String siren;

    public String getSiren() {
        return siren;
    }

    public void setSiren(String siren) {
        this.siren = siren;
    }
}