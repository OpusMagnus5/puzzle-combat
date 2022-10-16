package com.damian.bodzioch.puzzle.combat.model.DTO;

public class FamilyDTO {
    private int id;
    private String name;
    private String description;

    public FamilyDTO() {
    }

    public FamilyDTO(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    private FamilyDTO(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setDescription(builder.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FamilyDTO copy) {
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

        public FamilyDTO build() {
            return new FamilyDTO(this);
        }
    }
}
