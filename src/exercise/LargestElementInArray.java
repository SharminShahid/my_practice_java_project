package exercise;

public class LargestElementInArray {
    public static void main(String[] args){
        int[] arr = new int[] {78,56,45,345,60};
        int max = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("largest element is :" + max);
    }
}
