package com.company.model;

import com.company.model.obligation.Obligation;
import com.company.model.obligation.ObligationPersonal;
import com.company.model.obligation.ObligationProperty;

import java.util.ArrayList;

public class Insurance {
    private String description;
    private ArrayList<Obligation> obligations;

    public Insurance(String description, int propertyID){
        this.description = description;
        obligations = new ArrayList<Obligation>();
        this.fillObligations(propertyID);
    }

    public Insurance(String description, String naturalPersonName){
        this.description = description;
        obligations = new ArrayList<Obligation>();
        this.fillObligations(naturalPersonName);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Obligation> getObligations() {
        return obligations;
    }

    private void fillObligations(String naturalPersonName){
        Obligation o;
        String description;
        int probability;
        long approxImpact;
        PreMadePersonalObligations[] preMadePersonalObligations = PreMadePersonalObligations.values();
        for (PreMadePersonalObligations ppo : preMadePersonalObligations){
            description = ppo.getDescription();
            probability = ppo.getProbability();
            approxImpact = ppo.getApproxImpact();
            o = new ObligationPersonal(description, probability, approxImpact, naturalPersonName);
            obligations.add(o);
        }
    }

    private void fillObligations(int ID){
        Obligation o;
        String description;
        int probability;
        long approxImpact;
        PreMadePersonalObligations[] preMadePersonalObligations = PreMadePersonalObligations.values();
        for (PreMadePersonalObligations ppo : preMadePersonalObligations){
            description = ppo.getDescription();
            probability = ppo.getProbability();
            approxImpact = ppo.getApproxImpact();
            o = new ObligationProperty(description, probability, approxImpact, ID);
            obligations.add(o);
        }
    }

    public void addObligation(String description, int probability, long approxImpact, int ID){
        obligations.add(new ObligationProperty(description, probability, approxImpact, ID));
    }

    public void addObligation(String description, int probability, long approxImpact, String name){
        obligations.add(new ObligationPersonal(description, probability, approxImpact, name));
    }

    public long calculateCost(){
        long result = 0;
        for(Obligation o : obligations){
            result += o.getCost();
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Insurance: ");
        sb.append("description='").append(description).append('\'');
        sb.append(", obligations=").append(obligations);
        sb.append('.');
        return sb.toString();
    }
}
