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

    private Family(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setDescription(builder.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Family copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        builder.description = copy.getDescription();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public static final class Builder {
        private int id;
        private String name;
        private String description;

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

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Family build() {
            return new Family(this);
        }
    }
}
