package model;
import model.DndEnums.AbilityType;
import model.DndEnums.SkillName;
import model.DndEnums.ProficiencyLevel;
public class Skill {
    // instance variables
    private SkillName skillName;
    private AbilityType abilityType;
    private ProficiencyLevel proficiencyLevel;

    // constructor
    public Skill(SkillName skillName, AbilityType abilityType, ProficiencyLevel proficiencyLevel) {
        this.skillName = skillName;
        this.abilityType = abilityType;
        this.proficiencyLevel = proficiencyLevel;
    }

    // getter and setter methods for each instance variable
    public SkillName getSkillName() {
        return skillName;
    }

    public void setSkillName(SkillName skillName) {
        this.skillName = skillName;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(AbilityType abilityType) {
        this.abilityType = abilityType;
    }

    public ProficiencyLevel getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(ProficiencyLevel proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }
}
