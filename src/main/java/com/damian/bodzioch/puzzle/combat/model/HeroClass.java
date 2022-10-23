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

    public HeroClass() {
    }

    public HeroClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private HeroClass(Builder builder) {
        setId(builder.id);
        setName(builder.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeroClass copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        return builder;
    }

    public int getId() {
        return id;
    }

    public HeroClass setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public HeroClass setName(String name) {
        this.name = name;
        return this;
    }


    public static final class Builder {
        private int id;
        private String name;

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

        public HeroClass build() {
            return new HeroClass(this);
        }
    }
}
