package listandset;

import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(34);
        numbers.add(66);
        numbers.add(99);
        numbers.add(98);
        numbers.add(100);

        for (int i =0; i< numbers.size(); i++){
            //System.out.println(i);
            System.out.println(numbers.get(i));
        }
        for (Integer i1:numbers
             ) {
            System.out.println(i1);
            
        }
    }
}
