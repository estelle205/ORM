package net.joastbg.sampleapp.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ASSURANCE")
public class Assurance {
    @Id
    @Column(name = "idAssurance")
    private int numero;
    @Column
    private Date date_souscription;
    @Column
    private Date date_anniversaire;
    @Column
    private Date date_prelevement;
    @Column
    private boolean resilie;
    @Column
    private String typeAssurance;

    @ManyToOne
    @JoinColumn(name = "assurances")
    private Client assure;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    private List<Echeance> echeances = new ArrayList<>();





    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate_souscription() {
        return date_souscription;
    }

    public void setDate_souscription(Date date_souscription) {
        this.date_souscription = date_souscription;
    }

    public Date getDate_anniversaire() {
        return date_anniversaire;
    }

    public void setDate_anniversaire(Date date_anniversaire) {
        this.date_anniversaire = date_anniversaire;
    }

    public Date getDate_prelevement() {
        return date_prelevement;
    }

    public void setDate_prelevement(Date date_prelevement) {
        this.date_prelevement = date_prelevement;
    }

    public boolean isResilie() {
        return resilie;
    }

    public void setResilie(boolean resilie) {
        this.resilie = resilie;
    }

    public String getTypeAssurance() {
        return typeAssurance;
    }

    public void setTypeAssurance(String typeAssurance) {
        this.typeAssurance = typeAssurance;
    }

    public Client getClient() {
        return assure;
    }

    public void setClient(Client client) {
        this.assure = client;
    }

    public List<Echeance> getEcheances() {
        return echeances;
    }

    public void setEcheances(Echeance echeances) {
        this.echeances.add(echeances);
    }
}
