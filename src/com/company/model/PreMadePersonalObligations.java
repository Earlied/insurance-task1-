package com.company.model;

import com.company.model.obligation.ObligationPersonal;

public enum PreMadePersonalObligations {
    TRAUMA("Trauma, injury, fracture", 2, 300, ""),
    ANIMAL_BITE("Animal bite, snake bite, insect bite", 1, 1000, ""),
    HYPOTHERMIA("Frostbite, hypothermia", 2,  100, ""),
    BURN("Burn, heat stroke", 3, 150, ""),
    ELECTRIC_SHOCK("Electric shock, lightning strike", 3, 1500, "");

    private String description;
    private int probability; // 0-4: 0 - rare, ... , 4 - frequent
    private long approxImpact; // dollars
    private long cost; // dollars
    private String naturalPersonName;

    PreMadePersonalObligations(String description, int probability, long approxImpact, String naturalPersonName){
        this.description = description;
        this.probability = probability;
        this.approxImpact = approxImpact;
        this.naturalPersonName = naturalPersonName;
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

    public String getNaturalPersonName() {
        return naturalPersonName;
    }
}
