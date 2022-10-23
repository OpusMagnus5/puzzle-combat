package com.damian.bodzioch.puzzle.combat.model.DTO;

import com.damian.bodzioch.puzzle.combat.model.*;

public class HeroDTO {
    private int id;
    private String name;
    private int power;
    private Family family;
    private int teamCost;
    private String specialSkill;
    private int chargeSpeed;
    private HeroClass heroClass;
    private int stars;
    private GraknorkRating graknorkRating;
    private Color color;
    private int attack;
    private int defence;
    private int health;
    private Portal portal;

    public HeroDTO() {
    }

    public HeroDTO(int id, String name, int power, Family family, int teamCost, String specialSkill, int chargeSpeed,
                   HeroClass heroClass, int stars, GraknorkRating graknorkRating, Color color, int attack, int defence,
                   int health, Portal portal) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.family = family;
        this.teamCost = teamCost;
        this.specialSkill = specialSkill;
        this.chargeSpeed = chargeSpeed;
        this.heroClass = heroClass;
        this.stars = stars;
        this.graknorkRating = graknorkRating;
        this.color = color;
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.portal = portal;
    }

    private HeroDTO(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setPower(builder.power);
        setFamily(builder.family);
        setTeamCost(builder.teamCost);
        setSpecialSkill(builder.specialSkill);
        setChargeSpeed(builder.chargeSpeed);
        setHeroClass(builder.heroClass);
        setStars(builder.stars);
        setGraknorkRating(builder.graknorkRating);
        setColor(builder.color);
        setAttack(builder.attack);
        setDefence(builder.defence);
        setHealth(builder.health);
        setPortal(builder.portal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeroDTO copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        builder.power = copy.getPower();
        builder.family = copy.getFamily();
        builder.teamCost = copy.getTeamCost();
        builder.specialSkill = copy.getSpecialSkill();
        builder.chargeSpeed = copy.getChargeSpeed();
        builder.heroClass = copy.getHeroClass();
        builder.stars = copy.getStars();
        builder.graknorkRating = copy.getGraknorkRating();
        builder.color = copy.getColor();
        builder.attack = copy.getAttack();
        builder.defence = copy.getDefence();
        builder.health = copy.getHealth();
        builder.portal = copy.getPortal();
        return builder;
    }

    public int getId() {
        return id;
    }

    public HeroDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public HeroDTO setName(String name) {
        this.name = name;
        return this;
    }

    public int getPower() {
        return power;
    }

    public HeroDTO setPower(int power) {
        this.power = power;
        return this;
    }

    public Family getFamily() {
        return family;
    }

    public HeroDTO setFamily(Family family) {
        this.family = family;
        return this;
    }

    public int getTeamCost() {
        return teamCost;
    }

    public HeroDTO setTeamCost(int teamCost) {
        this.teamCost = teamCost;
        return this;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public HeroDTO setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
        return this;
    }

    public int getChargeSpeed() {
        return chargeSpeed;
    }

    public HeroDTO setChargeSpeed(int chargeSpeed) {
        this.chargeSpeed = chargeSpeed;
        return this;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public HeroDTO setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
        return this;
    }

    public int getStars() {
        return stars;
    }

    public HeroDTO setStars(int stars) {
        this.stars = stars;
        return this;
    }

    public GraknorkRating getGraknorkRating() {
        return graknorkRating;
    }

    public HeroDTO setGraknorkRating(GraknorkRating graknorkRating) {
        this.graknorkRating = graknorkRating;
        return this;
    }

    public Color getColor() {
        return color;
    }

    public HeroDTO setColor(Color color) {
        this.color = color;
        return this;
    }

    public int getAttack() {
        return attack;
    }

    public HeroDTO setAttack(int attack) {
        this.attack = attack;
        return this;
    }

    public int getDefence() {
        return defence;
    }

    public HeroDTO setDefence(int defence) {
        this.defence = defence;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public HeroDTO setHealth(int health) {
        this.health = health;
        return this;
    }

    public Portal getPortal() {
        return portal;
    }

    public HeroDTO setPortal(Portal portal) {
        this.portal = portal;
        return this;
    }

    public static final class Builder {
        private int id;
        private String name;
        private int power;
        private Family family;
        private int teamCost;
        private String specialSkill;
        private int chargeSpeed;
        private HeroClass heroClass;
        private int stars;
        private GraknorkRating graknorkRating;
        private Color color;
        private int attack;
        private int defence;
        private int health;
        private Portal portal;

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

        public Builder power(int power) {
            this.power = power;
            return this;
        }

        public Builder family(Family family) {
            this.family = family;
            return this;
        }

        public Builder teamCost(int teamCost) {
            this.teamCost = teamCost;
            return this;
        }

        public Builder specialSkill(String specialSkill) {
            this.specialSkill = specialSkill;
            return this;
        }

        public Builder chargeSpeed(int chargeSpeed) {
            this.chargeSpeed = chargeSpeed;
            return this;
        }

        public Builder heroClass(HeroClass heroClass) {
            this.heroClass = heroClass;
            return this;
        }

        public Builder stars(int stars) {
            this.stars = stars;
            return this;
        }

        public Builder graknorkRating(GraknorkRating graknorkRating) {
            this.graknorkRating = graknorkRating;
            return this;
        }

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder attack(int attack) {
            this.attack = attack;
            return this;
        }

        public Builder defence(int defence) {
            this.defence = defence;
            return this;
        }

        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder portal(Portal portal) {
            this.portal = portal;
            return this;
        }

        public HeroDTO build() {
            return new HeroDTO(this);
        }
    }
}
