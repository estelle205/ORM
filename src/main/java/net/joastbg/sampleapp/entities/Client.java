package net.joastbg.sampleapp.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Client  {
    @Id
    private int idClient;

    @Column(name = "nom")
    private String nom;
    @Column(name = "compte")
    private String compteBancairePrincipal;

    @OneToMany(mappedBy = "proprietaire", cascade = CascadeType.ALL)
    private List<CompteBancaire> compteBancaires = new ArrayList<>();

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
    private List<Contact> contacts = new ArrayList<>();

    @OneToMany(mappedBy = "assure", cascade = CascadeType.ALL)
    private List<Assurance> assurances = new ArrayList<>();

    public int getIdentifiant() {
        return idClient;
    }

    public void setIdentifiant(int identifiant) {
        this.idClient = identifiant;
    }

    public List<CompteBancaire> getCompteBancaires() {
        return compteBancaires;
    }
    public void setCompteBancaires(CompteBancaire c){
        this.compteBancaires.add(c);
    }
    public void delComteBancaire(CompteBancaire c){
        this.compteBancaires.remove(c);
    }

    public List<Assurance> getAssurances() {
        return assurances;
    }
    public void setAssurances(Assurance a){
        this.assurances.add(a);
    }
    public void delAssurance(Assurance c){
        this.assurances.remove(c);
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    public void setContacts(Contact c){
        this.contacts.add(c);
    }
    public void delContact(Contact c){
        this.compteBancaires.remove(c);
    }

    public void setCompteBancairePrincipal(CompteBancaire c) {
        this.compteBancairePrincipal = c.getIban();
    }

    public String getCompteBancairePrincipal(){
        return compteBancairePrincipal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nomClient) {
        this.nom = nomClient;
    }
}



