package model;
import model.DndEnums.AbilityType;

public class AbilityScore {
    // instance variables
    private AbilityType abilityType;
    private int score;

    // constructor
    public AbilityScore(AbilityType abilityType, int score) {
        this.abilityType = abilityType;
        this.score = score;
    }

    // getter and setter methods for each instance variable
    public AbilityType getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(AbilityType abilityType) {
        this.abilityType = abilityType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}