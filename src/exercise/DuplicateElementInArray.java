package exercise;

public class DuplicateElementInArray {
    public static void main(String[] args){
        int[] array = new int[] {3,5,3,5,6};
        System.out.println("duplicate element in array is");

        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }


}
