package exercise;

public class AscendingArray {
   /* public static void main(String[] args){
        int[] arr = new int[] {78,54,90,48,12};
        int temp = 0;

        System.out.println("original array is");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " , ");
        }
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("ascending order");
        for(int i =0; i< arr.length; i++)
        System.out.print(arr[i] + " , ");

    } */
    public static void main(String[] args){
        int[] arr = new int[] {45,6 ,56,78,34,21,22,1,0,99,45};
        int temp = 0;

        System.out.println("original array is");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " , ");
        }
        for(int i = 0;i< arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("ascending array is");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " , ");
        }
    }
}
