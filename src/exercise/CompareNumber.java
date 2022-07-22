package exercise;

public class CompareNumber {
    public static void main (String[] args){
        //compare two int number using Integer caching
        // Range is -128 to 127

        Integer num1 = 100;
        Integer num2 = 100;

        if(num1 == num2){
            System.out.println("equal number");
        }else{
            System.out.println("not equal number");
        }
        // if we use any number below or above the range it will give "not equal number"

    }


}
