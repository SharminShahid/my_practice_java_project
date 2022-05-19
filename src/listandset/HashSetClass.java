package listandset;

import java.util.HashSet;

public class HashSetClass {
    //collection of items where every item is unique
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();

        cars.add("toyota");
        cars.add("honda");
        cars.add("tesla");
        cars.add("bmw");
        cars.add("tesla");
        System.out.println(cars); // no duplication
    }
}
