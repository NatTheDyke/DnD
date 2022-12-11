package model;

import java.util.List;
import model.DndEnums.SizeCategory;

public class Race {
    // instance variables
    private String raceName;
    private List<String> features;
    private DndEnums.SizeCategory sizeCategory;
    private List<StatBonus> statBonuses;

    // constructor
    public Race(String raceName, List<String> features, SizeCategory sizeCategory, List<StatBonus> statBonuses) {
        this.raceName = raceName;
        this.features = features;
        this.sizeCategory = sizeCategory;
        this.statBonuses = statBonuses;
    }

    // getter and setter methods for each instance variable
    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public SizeCategory getSizeCategory() {
        return sizeCategory;
    }

    public void setSizeCategory(SizeCategory sizeCategory) {
        this.sizeCategory = sizeCategory;
    }

    public List<StatBonus> getStatBonuses() {
        return statBonuses;
    }

    public void setStatBonuses(List<StatBonus> statBonuses) {
        this.statBonuses = statBonuses;
    }
}