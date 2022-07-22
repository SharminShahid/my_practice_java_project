package exercise;

public class ArmstrongNumber {
    //a positive number is called armstrong number if it is equal to the sum of cubes of its digits.
    //eg: 1, 153, 370.371, 407 ect.
    // 153 = (1*1*1)+(5*5*5) + (3*3*3) = 1+125+27 = 153

    /*public static void isArmstrongNumber(int num){
        int cube = 0;
        int r;
        int t;
        t = num;

        while(num>0){
            r = num%10;
            num = num/10;
            cube = cube +(r*r*r);

        }
        if(t == cube){
            System.out.println("is armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
    public static void main(String[] args){
        isArmstrongNumber(153);
        isArmstrongNumber(0);
        isArmstrongNumber(1);
        isArmstrongNumber(407);
        isArmstrongNumber(555);
    }*/

    public static void isArmstrongNumber(int num){
        int cube = 0;
        int r;
        int t;
        t = num;

        while (num>0){
            r = num%10;
            num = num/10;
            cube = cube+ (r*r*r);
        }
        if (t == cube){
            System.out.println("is armstrongNumber");
        }else{
            System.out.println("is not armstrongNumber");
        }
    }
    public static void main(String[] args){
        isArmstrongNumber(370);
    }

    public static void isArmstrong(int num1){
        int cube1 = 0;
        int r1;
        int t1;
        t1 = num1;

        while (num1>0){
            r1 = num1%10;
            num1 = num1/10;
            cube1 = cube1+(r1*r1*r1);
        }
        if (t1 == cube1){
            System.out.println("is armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
   // public static void main(String[] args){    --- main method to call the isArmstrong method

    }




