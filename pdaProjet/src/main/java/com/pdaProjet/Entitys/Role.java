package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_role")
    private int id_role;
    @Column(name="role")
    private String name;


/*
    @OneToMany(cascade=CascadeType.ALL)
    private List<User> users;
*/

    public Role() {
        super();
    }


    public Role(int id_role, String name) {
        this.id_role = id_role;
        this.name = name;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id_role=" + id_role +
                ", name='" + name + '\'' +
                '}';
    }
}
