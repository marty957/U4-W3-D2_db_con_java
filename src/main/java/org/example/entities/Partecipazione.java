package org.example.entities;

import org.example.enumaration.Stato;

import javax.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "evento", nullable = false)
    private Evento evento;
    @Column(name = "stato_di_conferma")
    private Stato stato;


    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;





    public Partecipazione() {
    }


    public Partecipazione(Persona persona, Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
