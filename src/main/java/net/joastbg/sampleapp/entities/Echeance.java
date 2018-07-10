package net.joastbg.sampleapp.entities;

import javax.persistence.*;
import java.util.Date;

public class Echeance {

    @Id
    private int id;
    @Column
    private double prix;
    @Column
    private Date date_emission;
    @Column
    private Date date_paiement;
    @Column
    private Date emission_facture;

    @ManyToOne
    @JoinColumn(name = "echeances")
    private Assurance contrat;










    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDate_emission() {
        return date_emission;
    }

    public void setDate_emission(Date date_emission) {
        this.date_emission = date_emission;
    }

    public Date getDate_paiement() {
        return date_paiement;
    }

    public void setDate_paiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }

    public Date getEmission_facture() {
        return emission_facture;
    }

    public void setEmission_facture(Date emission_facture) {
        this.emission_facture = emission_facture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Assurance getContrat() {
        return contrat;
    }

    public void setContrat(Assurance contrat) {
        this.contrat = contrat;
    }
}
