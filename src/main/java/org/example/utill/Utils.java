package org.example.utill;

import java.util.Scanner;

public class Utils {
    public static final Scanner strScanner = new Scanner(System.in);
    public static final Scanner intScanner = new Scanner(System.in);

    public static String strScan(String command){
        System.out.print(command);
        String str = strScanner.nextLine();
        if (str.equals("") || str==null) {
            return strScan(command);
        }
        return str;
    }

    public static Integer intScan(String command){
        System.out.print(command);
        Integer i = intScanner.nextInt();
        if (i == null || i < 0) {
            return intScan(command);
        }
        return i;
    }

    public static Double doubleScan(String command){
        System.out.print(command);
        Double d = intScanner.nextDouble();
        if (d == null || d < 0){
            return doubleScan(command);
        }
        return d;
    }
}
