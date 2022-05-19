package importclass;

import java.util.Scanner;

public class AddUsingScanner {
    public static void main(String[] args){
        int a;
        int b;
        int sum;
        Scanner num = new Scanner(System.in);
        System.out.println("enter a number");
        a = num.nextInt();

        System.out.println("enter another number");
        b = num.nextInt();

        sum = a + b;
        System.out.println(sum);
    }
}
