package com.damian.bodzioch.puzzle.combat.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "t_family")
public class Family implements HibernateEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 32, unique = true)
    private String name;
    @Type(type = "text")
    private String description;

    public Family() {
    }

    public Family(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
