package exercise;

public class FactorialOfNumber {
    //factorial is the function by which it multiplies the number by every number below it.
    public static void main(String[] args){
        //factorial of 5
        int number = 5;
        int fact = 1;
        for(int i = 1; i<=number; i++){
            fact= fact*i; //1 = 1*1; (i)2*(fact)1 = (fact)2, (i)3*(fact)2=(fact)6, (i)4*(fact)6=(fact)24, (i)5*(fact)24=(fact)120
        }
        System.out.println("factolial is: "+fact);
    }
}
