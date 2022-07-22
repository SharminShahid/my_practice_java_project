package introduction;

public class Conditions {
    //if, else, else if

    public static void main(String[] args) {
        //if syntax
        /* if(condition){
        block of code to be executed if the condition is true}
         */
        int age = 30;
        if (age > 25) {
            System.out.println("age condition is true");
        }

        //else syntax
        /* if(condition1){
        block of code to be executed if condition1 is true}
        else(condition1){
        block of code to be executed if condition1 is false}
         */
        int number = 20;
        if (number < 15) {
            System.out.println("statement is wrong");
        } else {
            System.out.println("number is 20");
        }
        //else if syntax
        /* if(condition1){
        block of code to be executed if condition1 is true}
        else(condition1){
        block of code to be executed if condition1 is false}
        if else(condition2){
        block of code to be executed if condition2 is true}
         */
        int a = 10;
        int b = 20;
        if(a>b){
            System.out.println("if block");
        }

        else if(a<b){
            System.out.println("else if block");
        }
        else{
            System.out.println("else block");
        }

        // Question: write  a logic to find out the highest number
        //using nested if else and comparison operator
        int a1 = 300;
        int b1 = 200;
        int c1 = 500;

        if (a1>b1 & a1>c1){
            System.out.println("a1 is highest");
        } else if(b1>c1 & b1>a1){
            System.out.println("b1 is highest");
        }else{
            System.out.println("c1 is highest");
        }


    }
}
