package model;

import java.util.List;
import model.DndEnums.MagicSchool;
import model.DndEnums.ComponentType;

public class Spell {
    // instance variables
    private String name;
    private String description;
    private MagicSchool magicSchool;
    private List<ComponentType> components;
    private List<String> materialComponents;
    private int level;
    private String range;
    private String duration;

    // constructor
    public Spell(String name, String description, MagicSchool magicSchool, List<ComponentType> components, List<String> materialComponents, int level, String range, String duration) {
        this.name = name;
        this.description = description;
        this.magicSchool = magicSchool;
        this.components = components;
        this.materialComponents = materialComponents;
        this.level = level;
        this.range = range;
        this.duration = duration;
    }

    // getter and setter methods for each instance variable
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

    public MagicSchool getMagicSchool() {
        return magicSchool;
    }

    public void setMagicSchool(MagicSchool magicSchool) {
        this.magicSchool = magicSchool;
    }

    public List<ComponentType> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentType> components) {
        this.components = components;
    }

    public List<String> getMaterialComponents() {
        return materialComponents;
    }

    public void setMaterialComponents(List<String> materialComponents) {
        this.materialComponents = materialComponents;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}