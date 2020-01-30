package com.company;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {


    public static void main(String[] args) throws Exception {
        InfFunction infFunction = new InfFunction();
        System.out.println(infFunction.inflation(infFunction.cpi(2000, 14000, 6000, 8600, 2000), infFunction.cpi(1000, 7000, 3000, 4300, 1000)));
        CreateExcel createExcel = new CreateExcel("karmand","creator.bat");
        createExcel.start();
        Infaltionrepo infaltionrepo = new Infaltionrepo();
        infaltionrepo.insert(2010,2000, 14000, 6000, 8600, 2000,infFunction.cpi(2000, 14000, 6000, 8600, 2000),infFunction.inflation(infFunction.cpi(2000, 14000, 6000, 8600, 2000), infFunction.cpi(1000, 7000, 3000, 4300, 1000)),"123","123","Dashti","123");

    }


}

