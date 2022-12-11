package model;
import model.DndEnums.BackgroundType;

public class Background {
    // instance variables
    private BackgroundType backgroundType;
    private String description;

    // constructor
    public Background(BackgroundType backgroundType, String description) {
        this.backgroundType = backgroundType;
        this.description = description;
    }

    // getter and setter methods for each instance variable
    public BackgroundType getBackgroundType() {
        return backgroundType;
    }

    public void setBackgroundType(BackgroundType backgroundType) {
        this.backgroundType = backgroundType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}