package com.damian.bodzioch.puzzle.combat.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "t_hero_class")
public class HeroClass implements HibernateEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 32)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<TalentNode> talentNodes = new HashSet<>();

    public HeroClass() {
    }

    public HeroClass(int id, String name, Set<TalentNode> talentNodes) {
        this.id = id;
        this.name = name;
        this.talentNodes = talentNodes;
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

    public Set<TalentNode> getTalentNodes() {
        return talentNodes;
    }

    public void setTalentNodes(Set<TalentNode> talentNodes) {
        this.talentNodes = talentNodes;
    }
}
