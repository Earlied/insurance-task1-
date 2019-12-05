package com.company.model;

public enum PreMadeObligationsProperty {
    FIRE("Fire, lightning strike, gas explosion", 4, 31000, 0),
    NATURAL_DISASTER("Tornado, earthquake, flood", 1, 1000000, 0);

    private String description;
    private int probability; // 0-4: 0 - rare, ... , 4 - frequent
    private long approxImpact; // dollars
    private long cost; // dollars
    private int propertyID;

    PreMadeObligationsProperty(String description, int probability, long approxImpact, int ID){
        this.description = description;
        this.probability = probability;
        this.approxImpact = approxImpact;
        this.propertyID = ID;
    }

    public String getDescription() {
        return description;
    }

    public int getProbability() {
        return probability;
    }

    public long getApproxImpact() {
        return approxImpact;
    }

    public long getCost() {
        return cost;
    }

    public int getPropertyID() {
        return propertyID;
    }
}
