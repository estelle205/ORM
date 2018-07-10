package net.joastbg.sampleapp.dao;

import net.joastbg.sampleapp.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientDao {

    @Autowired
    SessionFactory sessionFactory;

    public Integer persist(Client client){
        Session session = sessionFactory.getCurrentSession();
        Integer returnID = (Integer) session.save(client);
        return returnID;
    }

    public List<Client> findAll(){
        Session session = sessionFactory.getCurrentSession();
        return  session.createQuery("from Client").list();
    }

    public void delete(Client client){
        Session session = sessionFactory.getCurrentSession();
        session.delete(client);
    }
}
