package introduction;

public class PracticeArray {
    //Array is a type of variable that can hold multiple values of same data types.
    //Syntax----- Array type Array name = Array value
    //two types. 1.Single dimensional. 2.Multidimensional or 2D Array

    public static void main(String[] args) {
        //declaration of array
        int[] Array = {3, 5, 6, 7, 8, 9};
        String[] Arr = {"may", "june", "july"};
       // System.out.println(Arr.length);

        //another way of declaration
        int[] number = new int[5]; //Array with size 5
        //initializing the Array
        number[0] = 12;
        number [1] = 20;
        number [2] = 30;
        number [3] = 40;
        number [4] = 50;

        //if we write number [5] it will give ArrayOutOfBoundException
        //.length method give the size of the array
        System.out.println(number.length);

       // to print all the values of array--- use for loop
        for (int i = 0; i <number.length; i++)
            System.out.println(number[i]);



        String[] name = new String[3];
        name[0] = "jony";
        name[1] = "moly";
        name[2] = "kale";
        System.out.println(name[1]);
       // System.out.println(name[2].length());
       System.out.println(name[0].replace('j','t'));
        System.out.println("----------");

       //advantage of array : It can hold multiple values
       // Disadvantage: 1. The length of array is fixed. Called static array
        // to overcome this problem we use collections. Collections are also called dynamic array.
       /*2.data type should be similar. To overcome this problem we use Object array. Object is a class. can store different
       data types*/
        Object ob[] = new Object[5];
        ob[0] = "tom";
        ob[1] = 23;
        ob[2] = 'M';
        ob[3] = 6.22;
        ob[4] = "London";
        //System.out.println(ob[2]);
        //System.out.println(ob.length);
        for (int k= 0; k< ob.length;k++){
            System.out.println(ob[k]);
        }

        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        //printing all the values of array
        for(int day=0; day<days.length; day++){
            System.out.println(days[day]);
        }



    }
}
