package exercise;

public class OddAndEvenNumbers {
    public static void main(String[] args){
        int[] arr = {43,78,88,79,34,25,57};

        System.out.println("odd numbers are:");
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("even numbers are: ");
        for(int i = 0; i< arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
