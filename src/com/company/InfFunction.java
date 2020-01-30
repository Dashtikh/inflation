package com.company;

import java.text.DecimalFormat;

public class InfFunction {
    float basecpi = 16000;


    public float inflation(float cpi1, float cpi2) {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return Float.parseFloat(decimalFormat.format((((cpi2 - cpi1) / cpi1) * 100)));

    }

    public float cpi(float bread, float rice, float meat, float dairy, float vegetables) {
        float sum = bread + rice + meat + dairy + vegetables;
        float cpi = sum/this.basecpi;
        return cpi;
    }
}
