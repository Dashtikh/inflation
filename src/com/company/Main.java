package com.company;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        InfFunction infFunction = new InfFunction();
        System.out.println(infFunction.inflation(infFunction.cpi(2000, 14000, 6000, 8600, 2000), infFunction.cpi(1000, 7000, 3000, 4300, 1000)));
        CreateExcel.getInstance().Creator("Person","creator.bat");
        CreateExcel.getInstance().closer();

    }


}

