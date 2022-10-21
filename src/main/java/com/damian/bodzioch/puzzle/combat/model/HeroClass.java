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

    private HeroClass(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setTalentNodes(builder.talentNodes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeroClass copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        builder.talentNodes = copy.getTalentNodes();
        return builder;
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


    public static final class Builder {
        private int id;
        private String name;
        private Set<TalentNode> talentNodes;

        private Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder talentNodes(Set<TalentNode> talentNodes) {
            this.talentNodes = talentNodes;
            return this;
        }

        public HeroClass build() {
            return new HeroClass(this);
        }
    }
}
