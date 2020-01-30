package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CreateExcel {
    private CreateExcel(){};
    private static CreateExcel createExcel = new CreateExcel ();
    public static CreateExcel getInstance(){
        return createExcel;
    }
    public void Creator(String dbname , String path) throws FileNotFoundException, UnsupportedEncodingException {
        String db="select * from "+dbname+";";
        System.out.println(db);
        PrintWriter writer = new PrintWriter("creator.bat", "UTF-8");
        writer.println("sqlplus Dashtikh/dashti1565 @creator.sql");
        PrintWriter writer1 = new PrintWriter("creator.sql","UTF-8");
        writer1.println("set markup html on ");
        writer1.println("spool C:\\Users\\moham\\Desktop\\Messenger-Front-master\\"+dbname+".xls");
        writer1.println(db);
        writer1.println("spool off");
        writer1.println("exit");
        writer.close();
        writer1.close();
        Runtime runtime = Runtime.getRuntime();
        try {
            Process p1 = runtime.exec("cmd /c start "+path);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void closer(){
        try {
            Thread.sleep(1000);
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
