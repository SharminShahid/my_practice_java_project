package exercise;

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = new int[] {5,6,7};
        System.out.println("length of array :" +arr.length);
        System.out.println("reverse of array");

        for(int i = arr.length-1; i>= 0; i--){
            System.out.print(arr[i]);
        }
    }
}
