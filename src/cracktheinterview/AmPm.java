package cracktheinterview;

import java.io.*;

import java.util.*;

public class AmPm {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String ampm = s.substring(8,10);
        if(ampm.equals("PM")){
            int hora = Integer.getInteger(s.substring(0,1));
            hora = hora +12;
            ampm = hora + s.substring(2,10);
        }
        return ampm;

    }


    public static void main(String[] args) throws IOException {
        

        String result = timeConversion("07:05:45PM");
        System.out.println(result);
        

    }
}
