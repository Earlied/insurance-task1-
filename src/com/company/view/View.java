package com.company.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View implements Constants{
    static Locale locale = new Locale("ua", "UA");
    private static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle("message" , locale);

    public void print(String msg){
        System.out.println(msg);
    }

    private String[] getResBundleStrings(String ...str){
        String[] resBundleStrings = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            resBundleStrings[i] = resourceBundle.getString(str[i]);
        }
        return resBundleStrings;
    }

    public void showInsuranceInfo(String format, String ... rateFormats){
        print(String.format(format, resourceBundle.getString(INSURANCE_DESCRIPTION)));
        for (String rateFormat : rateFormats) {
            print(String.format(rateFormat, getResBundleStrings(OBLIGATION_DESCRIPTION, COST, PROBABILITY, IMPACT, ID)));
        }
    }
}
