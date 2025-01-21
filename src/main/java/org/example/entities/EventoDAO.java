package org.example.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static org.example.entities.TipoEvento.PUBBLICO;

public class EventoDAO {

    private static EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestioneEv");
    private static EntityManager em= emf.createEntityManager();


    public static void main( String[] args ){

        Evento ev1= new Evento("la sagra del Lambrusco", LocalDate.now(),
                "si beve e si mangia gratis",PUBBLICO,300);
       /* save(ev1);*/
       /* getById(1);*/

        remove(2);



        em.close();
        emf.close();


    }


    public static void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println("evento aggiunto");
    }

    public static Evento getById(long i){

       Evento e= em.find(Evento.class,i);
        System.out.println(e);
        return e;

    }


    public static void remove(long i){
        Evento e=getById(i);
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        System.out.println("evento eliminato correttamenti");
    }


}


