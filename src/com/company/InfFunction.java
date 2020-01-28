package com.company;

import java.text.DecimalFormat;

public class InfFunction {
    public float calculate1(float bread, float rice, float meat, float dairy, float vegetables) {
        float basecpi = 16000;
        float newcpi = bread + rice + meat + dairy + vegetables;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        return Float.parseFloat(decimalFormat.format((newcpi / basecpi) * 100));
    }

    public float calculate2(float bread, float rice, float meat, float dairy, float vegetables) {
        float basecpi = 16000;
        float newcpi = bread + rice + meat + dairy + vegetables;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        return Float.parseFloat(decimalFormat.format((newcpi / basecpi) * 100));


    }

    public float inflation(float cpi1, float cpi2) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return Float.parseFloat(decimalFormat.format((((cpi2 - cpi1) / cpi1) * 100)));

    }
}
