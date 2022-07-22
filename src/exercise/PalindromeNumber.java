package exercise;

import java.util.Scanner;

public class PalindromeNumber {
    //Palindrome-number is a number the number which remains same if we reverse it.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:" );

        int num= sc.nextInt();
        int orgNum = num;
        int rev = 0;

        while (num!= 0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if(orgNum==rev){
            System.out.println("palindrome number");
        }else{
            System.out.println(("not palindrome number"));
        }

    }
}
