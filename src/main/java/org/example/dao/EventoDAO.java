package org.example.dao;

import org.example.entities.Evento;

import javax.persistence.EntityManager;

public class EventoDAO {

    private EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }



    public  void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println("evento aggiunto");
    }

    public  Evento getById(long i){

       Evento e= em.find(Evento.class,i);
        System.out.println(e);
        return e;

    }


    public  void remove(Evento e){
      em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        System.out.println("evento eliminato correttamenti");
    }



}


