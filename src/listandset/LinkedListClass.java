package listandset;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("volvo");
        cars.add("toyota");
        cars.add("honda");

        System.out.println(cars.size());
    }
}
//same as ArrayList.