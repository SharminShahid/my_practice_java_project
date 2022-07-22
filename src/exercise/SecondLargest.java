package exercise;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = new int[] {9,8,2,6,5};
        int temp;
        int size = arr.length;
        System.out.println(size);

        for(int i = 0; i<size; i++){
            for(int j =i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr [j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("array in ascending order");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" , ");
        }
        System.out.println();
        System.out.println("second largest number is:" +arr[size-2]);
        System.out.println("third largest number is :" +arr[size-3]);
    }

}
