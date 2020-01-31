package com.company;

public class Main {


    public static void main(String[] args) throws Exception {
        int i = 1;
        InfFunction infFunction = new InfFunction();

        System.out.println(infFunction.inflation(infFunction.cpi(2000, 14000, 6000, 8600, 2000), infFunction.cpi(1000, 7000, 3000, 4300, 1000)));
        CreateExcel createExcel = new CreateExcel("inflation", "creator.bat");
        createExcel.start();
        Infaltionrepo infaltionrepo = new Infaltionrepo();
        for (; i <= 5; i++) {
            infaltionrepo.insert(i, 2000 * i, 14000, 6000, 8600, 2000, infFunction.cpi(2000, 14000, 6000, 8600, 2000) * i, infFunction.inflation(infFunction.cpi(2000, 14000, 6000, 8600, 2000), infFunction.cpi(1000, 7000, 3000, 4300, 1000)), "123", "123", "Dashti", "123");
        }
        LineChart lineChart = new LineChart("inflation");
    }


}

