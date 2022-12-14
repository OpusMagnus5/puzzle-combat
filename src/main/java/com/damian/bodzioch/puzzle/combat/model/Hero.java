package com.damian.bodzioch.puzzle.combat.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "t_hero")
public class Hero implements HibernateEntities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    @Column(precision = 3)
    private int power;
    @ManyToOne(fetch = FetchType.EAGER)
    private Family family;
    @Column(precision = 2)
    private int teamCost;
    @Type(type = "text")
    private String specialSkill;
    @Column(precision = 3)
    private int chargeSpeed;
    @ManyToOne(fetch = FetchType.EAGER)
    private HeroClass heroClass;
    @Column(precision = 1)
    private int stars;
    @OneToOne(fetch = FetchType.LAZY)
    private GraknorkRating graknorkRating;
    @Enumerated(EnumType.STRING)
    private Color color;
    @Column(precision = 4)
    private int attack;
    @Column(precision = 4)
    private int defence;
    @Column(precision = 4)
    private int health;
    @Enumerated(EnumType.STRING)
    private Portal portal;

    public Hero() {
    }

    public Hero(int id, String name, int power, Family family, int teamCost, String specialSkill, int chargeSpeed,
                HeroClass heroClass, int stars, GraknorkRating graknorkRating, Color color, int attack, int defence,
                int health, Portal portal, int charge) {
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

    private Hero(Builder builder) {
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

    public static Builder builder(Hero copy) {
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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int getTeamCost() {
        return teamCost;
    }

    public void setTeamCost(int teamCost) {
        this.teamCost = teamCost;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(String specialSkill) {
        this.specialSkill = specialSkill;
    }

    public int getChargeSpeed() {
        return chargeSpeed;
    }

    public void setChargeSpeed(int chargeSpeed) {
        this.chargeSpeed = chargeSpeed;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public GraknorkRating getGraknorkRating() {
        return graknorkRating;
    }

    public void setGraknorkRating(GraknorkRating graknorkRating) {
        this.graknorkRating = graknorkRating;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Portal getPortal() {
        return portal;
    }

    public void setPortal(Portal portal) {
        this.portal = portal;
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

        public Hero build() {
            return new Hero(this);
        }
    }
}
