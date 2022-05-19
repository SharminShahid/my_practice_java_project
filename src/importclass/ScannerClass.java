package importclass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String name;


        //enter name and press enter
        System.out.println("enter username");
        System.out.println("enter age");
        name = obj.nextLine();

        System.out.println("user name is :" + name);

    }
}
