package com.company.controller;

import com.company.model.Insurance;
import com.company.model.Model;
import com.company.view.View;

public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Insurance accidentInsurance = new Insurance("Accident insurance", "Josh Jackson");
        view.print(accidentInsurance.toString());

        accidentInsurance.sortByRisk();
        view.print(accidentInsurance.toString());

    }
}
