package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));

        NumberFormat localeCurrencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(localeCurrencyFormat.format(doubleValue));

        DecimalFormat decimalFormat1 = new DecimalFormat("$000.00");
        System.out.println(decimalFormat1.format(1));

        DecimalFormat decimalFormat2 = new DecimalFormat("##0.00# €");
        System.out.println(decimalFormat2.format(20.124));
        
    }
}
