package newPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,6,7};

        int len = arr.length;

        System.out.println("reverse array is :");

        for(int i = len-1; i>=0;i--){
            System.out.print(arr[i]);
        }
    }





}
