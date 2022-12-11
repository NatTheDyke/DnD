package model;

import java.util.List;

public class DndCharacter {
    // instance variables
    private String name;
    private Race race;
    private CharacterClass characterClass;
    private int level;
    private List<AbilityScore> abilityScores;
    private List<Skill> skills;
    private Background background;
    private String alignment;
    private List<Item> inventory;
    private List<Spell> spells;

    // constructor
    public DndCharacter(String name, Race race, CharacterClass characterClass, int level, List<AbilityScore> abilityScores, List<Skill> skills, Background background, String alignment, List<Item> inventory, List<Spell> spells) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.level = level;
        this.abilityScores = abilityScores;
        this.skills = skills;
        this.background = background;
        this.alignment = alignment;
        this.inventory = inventory;
        this.spells = spells;
    }

    // getter and setter methods for each instance variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getter and setter methods for the race instance variable
    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    // getter and setter methods for the characterClass instance variable
    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    // getter and setter methods for the level instance variable
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // getter and setter methods for the abilityScores instance variable
    public List<AbilityScore> getAbilityScores() {
        return abilityScores;
    }

    public void setAbilityScores(List<AbilityScore> abilityScores) {
        this.abilityScores = abilityScores;
    }

    // getter and setter methods for the skills instance variable
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    // getter and setter methods for the background instance variable
    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }
    // getter and setter methods for the alignment instance variable
    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    // getter and setter methods for the inventory instance variable
    public List<Item> getInventory() {
        return inventory;
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    // getter and setter methods for the spells instance variable
    public List<Spell> getSpells() {
        return spells;
    }

    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }
}

