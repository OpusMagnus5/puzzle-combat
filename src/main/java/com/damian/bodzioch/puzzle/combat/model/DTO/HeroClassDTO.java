package com.damian.bodzioch.puzzle.combat.model.DTO;

public class HeroClassDTO {
    private int id;
    private String name;

    public HeroClassDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HeroClassDTO() {
    }

    private HeroClassDTO(Builder builder) {
        setId(builder.id);
        setName(builder.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeroClassDTO copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        return builder;
    }

    public int getId() {
        return id;
    }

    public HeroClassDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public HeroClassDTO setName(String name) {
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

        public HeroClassDTO build() {
            return new HeroClassDTO(this);
        }
    }
}
