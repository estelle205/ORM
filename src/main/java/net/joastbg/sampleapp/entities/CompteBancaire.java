package net.joastbg.sampleapp.entities;


import javax.persistence.*;

@Entity
@Table(name = "COMPTE_BANCAIRE")
public class CompteBancaire {
    @Id
    private String iban;
    @Column (name="swift_code")
    private String bic;

    @ManyToOne
    @JoinColumn(name = "compteBancaires")
    private Client proprietaire;


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }
}
