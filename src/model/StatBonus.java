package model;

import model.DndEnums.AbilityType;

public class StatBonus {
    // instance variables
    private AbilityType abilityType;
    private int bonus;

    // constructor
    public StatBonus(AbilityType abilityType, int bonus) {
        this.abilityType = abilityType;
        this.bonus = bonus;
    }

    // getter and setter methods for each instance variable
    public AbilityType getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(AbilityType abilityType) {
        this.abilityType = abilityType;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
