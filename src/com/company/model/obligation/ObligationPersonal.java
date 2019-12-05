package com.company.model.obligation;

public class ObligationPersonal extends Obligation{
    private String naturalPersonName;
    public ObligationPersonal(String description, int probability, long impact, String name){
        super(description, probability, impact);
        this.naturalPersonName = name;
    }

    public String getNaturalPersonName() {
        return naturalPersonName;
    }

    public void setNaturalPersonName(String naturalPersonName) {
        this.naturalPersonName = naturalPersonName;
    }

    @Override
    public String toString() {
        return  "Natural Person: " + naturalPersonName + "\n" + super.toString();
    }
}
