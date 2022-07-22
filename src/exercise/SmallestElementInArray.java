package exercise;

public class SmallestElementInArray {
    public static void main (String[] args){
        int[] array = new int[] {67,45,33,12,567};
        int min = array[0];

        for(int i = 1; i< array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Minimum array is " +min);
    }
}
