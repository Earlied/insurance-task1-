package com.company.model.obligation;

public class ObligationProperty extends Obligation {
    private int propertyID;
    public ObligationProperty(String description, int probability, long impact, int ID){
        super(description, probability, impact);
        this.propertyID = ID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public String toString() {
        return  "PropertyID:" + propertyID + "\n" + super.toString();
    }
}
