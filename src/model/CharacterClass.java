package model;

import model.DndEnums.SkillName;

import java.util.List;

public class CharacterClass {
    // instance variables
    private String name;
    private List<SkillName> startingProficiencies;
    private List<Feature> features; // refactored instance variable to use Feature class
    private int hitDice;
    private List<Item> startingEquipment;

    // constructor
    public CharacterClass(String name, List<SkillName> startingProficiencies, List<Feature> features, int hitDice, List<Item> startingEquipment) {
        this.name = name;
        this.startingProficiencies = startingProficiencies;
        this.features = features;
        this.hitDice = hitDice;
        this.startingEquipment = startingEquipment;
    }

    // getter and setter methods for each instance variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter methods for the startingProficiencies instance variable
    public List<SkillName> getStartingProficiencies() {
        return startingProficiencies;
    }

    public void setStartingProficiencies(List<SkillName> startingProficiencies) {
        this.startingProficiencies = startingProficiencies;
    }

    // getter and setter methods for the features instance variable
    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    // getter and setter methods for the hitDice instance variable
    public int getHitDice() {
        return hitDice;
    }

    public void setHitDice(int hitDice) {
        this.hitDice = hitDice;
    }

    // getter and setter methods for the startingEquipment instance variable
    public List<Item> getStartingEquipment() {
        return startingEquipment;
    }

    public void setStartingEquipment(List<Item> startingEquipment) {
        this.startingEquipment = startingEquipment;
    }
}
