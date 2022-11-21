package newPractice;

import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {

        String rev = "";
        System.out.println("enter your word");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);



       /* String str = "Java";
        String rev = "";

        int len = str.length();

        for (int i = len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (str.equalsIgnoreCase(rev)){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }*/

    }
}
