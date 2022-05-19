package listandset;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        //ArrayList class is a resizable array.
        //we can modify the size of Arraylist. i.e add or remove items.
        //Behind every ArrayList there is an array.
        //slow
        //Elements in ArrayList are objects.eg: String
        //Object type must be non primitive.
        //we must specify the objects by equivalent wrapper class.
        //Integer , Boolean, Character etc.

        //Syntax:
        ArrayList<String> name = new ArrayList<>();

        ArrayList<String> cars = new ArrayList<String>();
        //add items:
        cars.add("volvo");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Kia");
        cars.add("Tesla");

        //get element:
        cars.get(1);
        System.out.println(cars.get(1));

        //change element:
        cars.set(0,"Toyota");
        System.out.println(cars.set(0,"Toyota"));
        System.out.println(cars);

        //get the size of Arraylist
        System.out.println(cars.size());

        // remove element
        System.out.println(cars.remove(2));
    }
}
