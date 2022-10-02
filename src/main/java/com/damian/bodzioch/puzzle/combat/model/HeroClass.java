package com.damian.bodzioch.puzzle.combat.model;

import javax.persistence.*;

@Entity(name = "thero-class")
public class HeroClass implements HibernateEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 32)
    private String name;
    @OneToMany(fetch = FetchType.LAZY)
    private TalentNode talentNode;

    public HeroClass() {
    }

    public HeroClass(int id, String name, TalentNode talentNode) {
        this.id = id;
        this.name = name;
        this.talentNode = talentNode;
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

    public TalentNode getTalentNode() {
        return talentNode;
    }

    public void setTalentNode(TalentNode talentNode) {
        this.talentNode = talentNode;
    }
}
