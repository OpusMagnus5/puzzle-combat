package com.damian.bodzioch.puzzle.combat.model;

import javax.persistence.*;

@Entity(name = "tgraknork-rating")
public class GraknorkRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private EmblemPath emblemPath;
    @Column(precision = 2, scale = 1)
    private double buffBooster;
    @Column(precision = 2, scale = 1)
    private double bloodyBattle;
    @Column(precision = 2, scale = 1)
    private double chargedAttack;
    @Column(precision = 2, scale = 1)
    private double offence;
    @Column(precision = 2, scale = 1)
    private double defence;
    @Column(precision = 2, scale = 1)
    private double warMachines;
    @Column(precision = 2, scale = 1)
    private double skill;
    @Column(precision = 2, scale = 1)
    private double pve;
    @Column(precision = 2, scale = 1)
    private double speed;

    public GraknorkRating(int id, EmblemPath emblemPath, double buffBooster, double bloodyBattle, double chargedAttack,
                          double offence, double defence, double warMachines, double skill, double pve, double speed) {
        this.id = id;
        this.emblemPath = emblemPath;
        this.buffBooster = buffBooster;
        this.bloodyBattle = bloodyBattle;
        this.chargedAttack = chargedAttack;
        this.offence = offence;
        this.defence = defence;
        this.warMachines = warMachines;
        this.skill = skill;
        this.pve = pve;
        this.speed = speed;
    }

    public GraknorkRating() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmblemPath getEmblemPath() {
        return emblemPath;
    }

    public void setEmblemPath(EmblemPath emblemPath) {
        this.emblemPath = emblemPath;
    }

    public double getBuffBooster() {
        return buffBooster;
    }

    public void setBuffBooster(double buffBooster) {
        this.buffBooster = buffBooster;
    }

    public double getBloodyBattle() {
        return bloodyBattle;
    }

    public void setBloodyBattle(double bloodyBattle) {
        this.bloodyBattle = bloodyBattle;
    }

    public double getChargedAttack() {
        return chargedAttack;
    }

    public void setChargedAttack(double chargedAttack) {
        this.chargedAttack = chargedAttack;
    }

    public double getOffence() {
        return offence;
    }

    public void setOffence(double offence) {
        this.offence = offence;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getWarMachines() {
        return warMachines;
    }

    public void setWarMachines(double warMachines) {
        this.warMachines = warMachines;
    }

    public double getSkill() {
        return skill;
    }

    public void setSkill(double skill) {
        this.skill = skill;
    }

    public double getPve() {
        return pve;
    }

    public void setPve(double pve) {
        this.pve = pve;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
