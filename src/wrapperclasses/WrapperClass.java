package wrapperclasses;

import java.awt.*;

public class WrapperClass {
    //it provides option to use primitive data type as object.
    public static void main(String[] args){
        Integer age = 23;
        Double num = 2.75;
        Short x = 344;

        System.out.println(age);
        System.out.println(num.doubleValue());

        String s = "100";
        System.out.println(s+20);//output is 10020.here String concatination occurs

        //convert the String to int,--- by using wrapper class. parseInt method
        int i = Integer.parseInt(s);
        System.out.println(i+20);

        //String to Double
        String d = "12.33";
        double D= Double.parseDouble(d);
        System.out.println(D+10);

        //string to Boolean
        String k ="true";
        boolean bl = Boolean.parseBoolean(k);
        System.out.println(bl);

        //int to String
        int j = 10;
        String j1 = String.valueOf(j);
        System.out.println(j1+10); //String concatination . output 1010

        String g = "100A";
        Integer.parseInt(g); // it gives NumberFormatException

    }
}
