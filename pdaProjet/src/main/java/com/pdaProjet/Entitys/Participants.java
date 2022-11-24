package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="participant")
public class Participants extends ArrayList<Participants> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String domaine;
    private String structure;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_activité")
    private Activite activité;*/
    public Participants(){}

    public Participants(String domaine, String structure) {
        this.domaine = domaine;
        this.structure = structure;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "id=" + id +
                ", domaine='" + domaine + '\'' +
                ", structure='" + structure + '\'' +
                '}';
    }
    /*    public Activite getActivité() {
        return activité;
    }

    public void setActivité(Activite activité) {
        this.activité = activité;
    }*/
}
