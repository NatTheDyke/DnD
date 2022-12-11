package model;

public class Feature {
    // instance variables
    private String name;
    private String description;

    // constructor
    public Feature(String name, String description) {
        this.name = name;
        this.description = description;
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
}

