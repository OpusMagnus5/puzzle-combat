package com.damian.bodzioch.puzzle.combat.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "t_talent_node")
public class TalentNode implements HibernateEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany
    private Set<HeroClass> heroClass;
    @Column(precision = 2)
    private int level;
    @Column(length = 32)
    private String name;
    @Type(type = "text")
    private String description;

    public TalentNode() {
    }

    public Set<HeroClass> getHeroClass() {
        return heroClass;
    }

    public TalentNode setHeroClass(Set<HeroClass> heroClass) {
        this.heroClass = heroClass;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public TalentNode(int id, Set<HeroClass> heroClass, int level, String name, String description) {
        this.id = id;
        this.heroClass = heroClass;
        this.level = level;
        this.name = name;
        this.description = description;
    }
}
