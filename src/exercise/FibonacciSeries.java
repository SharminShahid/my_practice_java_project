package exercise;

public class FibonacciSeries {
    //In Fibonacci series next number is the sum of previous two numbers
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int sum;
        int count = 20; // it is the number upto which the series will run
        System.out.print(n1 +" , "+n2);
        for (int i = 2; i<= count; i++){
            sum= n1 + n2;
            System.out.print(" , " +sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
