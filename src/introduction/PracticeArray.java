package introduction;

public class PracticeArray {
    //Array is a type of variable that can hold multiple values.
    //Syntax----- Array type Array name = Array value
    //two types. 1.Single dimensional. 2.Multidimensional or 2D Array

    public static void main(String[] args) {
        //declaration of array
        int[] Array = {3, 5, 6, 7, 8, 9};
        String[] Arr = {"may", "june", "july"};
        System.out.println(Arr.length);

        //another way of declaration
        int[] number = new int[5]; //Array with size 5
        //initializing the Array
        number = new int[0];
        number = new int[1];
        number = new int[2];
        number = new int[3];
        number = new int[4];

        number[1] = 22;//assigning the value at index 1
        for (int i = 0; i <= number.length; i++)
            System.out.println(i);



        String[] name = new String[3];
        name[0] = "jony";
        name[1] = "moly";
        name[2] = "kale";
        System.out.println(name[1]);
        System.out.println(name[2].length());
        System.out.println(name[0].replace('j','t'));

    }
}
