package introduction;

public class SwapVariable {
    public static void main(String[] args){
        //variable type variable name = variable value

        int myNum1 = 20;
        int myNum2 = 10;

        int temp;
        //System.out.println("value of myNum1 :"+myNum1);
        //System.out.println("value of myNum2 :"+myNum2);

        temp = myNum1;
        //System.out.println("value of temp :"+temp);
        //System.out.println("value of myNum1 :"+myNum1);

        myNum1 = myNum2;
       // System.out.println("value of myNum1 :"+myNum1);
       // System.out.println("value of myNum2 :"+myNum2);

        myNum2 = temp;
        System.out.println("value of myNum2 :"+myNum2);
        System.out.println("value of myNum1 :"+myNum1);
    }

    //final keyword: if a variable is final that means we can not reassign the value of that variable.
     final int myNum = 40;
     //myNum = 50; // it gives error as the variable myNum is final
}
