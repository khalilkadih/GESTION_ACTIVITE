package com.pdaProjet.Entitys;
import jakarta.persistence.CascadeType;
import jakarta.persistence.*;
import java.util.List;
@Entity

@Table(name="activite")

public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="titre")
    private String titre;
    @Column(name="description")
    private String description;
    @Column(name="date_debut")
    private String date_debut;
    @Column(name=" date_defin")
    private String date_defin;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Participants> participants;
 /*   @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_etat")*/
    private EtatEnum etat;

    public Activite(String titre, String description, String date_debut, String date_defin) {
        super();
        this.titre = titre;
        this.description = description;
        this.date_debut = date_debut;
        this.date_defin = date_defin;
    }



    public Activite() {
    }


    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }
    public String getDate_defin() {
        return date_defin;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setDate_defin(String date_defin) {
        this.date_defin = date_defin;
    }

    public List<Participants> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participants> participants) {
        this.participants = participants;
    }

    public EtatEnum getEtat() {
        return etat;
    }

    public void setEtat(EtatEnum etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Activite{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_debut='" + date_debut + '\'' +
                ", date_defin='" + date_defin + '\'' +
                ", participants=" + participants +
                ", etat=" + etat +
                '}';
    }
}
