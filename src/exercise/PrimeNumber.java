package exercise;

public class PrimeNumber {
    // Prime number is a whole number, greater than 1, that is divided only by 1 or that specific number.
    public static void main(String[] args){
        int number = 19;
        int temp = 0;
        for (int i = 2; i<= number/2; i++){
            if(number%i==0){
                temp = temp+1;
                break;
            }
        }
      if(temp == 0){
          System.out.println("prime number");
      }else{
          System.out.println("not a prime number");
      }

    }
}
