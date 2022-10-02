package com.damian.bodzioch.puzzle.combat.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity(name = "thero")
public class Hero {
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

    public Hero(int id, String name, int power, Family family, int teamCost, String specialSkill, int chargeSpeed,
                HeroClass heroClass, int stars, GraknorkRating graknorkRating, Color color) {
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
    }

    public Hero() {
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
}
