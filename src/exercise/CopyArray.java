package exercise;

public class CopyArray {
    public static void main(String[] args){
        int[] arr1 = new int[] {1,7,6,9};
        //creating arr2 with same length of arr1
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }
        for (int i = 0; i< arr2.length; i++){
            System.out.print( arr2[i]);
        }

    }
}
