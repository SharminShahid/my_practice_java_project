package exercise;

public class DescendingArray {
    /*public static void main(String[] args){
        int[] arr = new int[] {78,54,90,48,12};
        int temp = 0;

        System.out.println("original array is");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] +" , ");
        }
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.println();
        System.out.println("descending order");
        for(int i =0; i< arr.length; i++)
            System.out.print(arr[i] + " , ");

    }*/
    public static void main(String[] args){
        int[] arr = new int[]{34,23,12,56,78,89,11,90};
        int temp = 0;

        System.out.println("original array");
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" , ");
        }
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("descending assay is");
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+ " , ");
        }
    }
}
