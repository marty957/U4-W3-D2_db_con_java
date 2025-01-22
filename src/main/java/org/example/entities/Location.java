package org.example.entities;

import javax.persistence.*;

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nome_Location", nullable = false)
    private String nome;
    @Column(name = "citta", nullable = false)
    private String citta;

    @OneToOne
    @JoinColumn(name = "evento_id")
    private Evento event;

    public Location() {
    }


    public Location(String nome, String citta, Evento evento) {
        this.nome = nome;
        this.citta = citta;
        this.event = evento;
    }

    public Evento getEvento() {
        return event;
    }

    public void setEvento(Evento evento) {
        this.event = evento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", evento=" + event +
                '}';
    }
}
