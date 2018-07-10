package net.joastbg.sampleapp;

import junit.framework.Assert;
import net.joastbg.sampleapp.dao.ClientDao;
import net.joastbg.sampleapp.entities.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=false)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/config/BeanLocations.xml")
public class ClientDaoTest {

    @Autowired
    ClientDao clientDao;

    PersonneMorale societe;
    PersonnePhysique client;

    CompteBancaire compte;
    Contact contact;

    Assurance assurance;

    Echeance echeances;

    @Before
    public void setUp() {
        client = new PersonnePhysique();
        client.setPrenom("Dao");
        client.setNom("Roger");
        client.setIdentifiant(150);

        compte = new CompteBancaire();
        compte.setIban("165968");
        compte.setBic("195953");

        contact = new Contact();
        contact.setId(1);
        contact.setType("telephone");
        contact.setValeur("0626069045");

        assurance = new Assurance();
        assurance.setDate_anniversaire(new Date(2000-01-01));
        assurance.setDate_prelevement(new Date(2000-01-15));
        assurance.setDate_souscription(new Date(2000-02-20) );
        assurance.setNumero(10);
        assurance.setResilie(false);

        echeances = new Echeance();
        echeances.setDate_emission(new Date(2000-01-01));
        echeances.setDate_paiement(new Date(2001-02-05));
        echeances.setEmission_facture(new Date(2002-03-10));
        echeances.setId(5);
        echeances.setPrix(255.50);

        assurance.setEcheances(echeances);

        compte.setProprietaire(client);
        client.setCompteBancairePrincipal(compte);
        client.setCompteBancaires(compte);
        client.setContacts(contact);
        client.setAssurances(assurance);


        societe = new PersonneMorale();
        societe.setNom("Blablacar");
        societe.setSiren("195959008435");
        societe.setIdentifiant(2500);

    }

    @Test
    public void testPersistPersonnePhysique(){
        Integer id = clientDao.persist(client);
        Assert.assertTrue(id !=null);
        clientDao.delete(client);
    }
    @Test
    public void testPersistPersonneMorale(){
        Integer id = clientDao.persist(societe);
        Assert.assertTrue(id !=null);
        clientDao.delete(societe);
    }




}
