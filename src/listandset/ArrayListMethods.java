package listandset;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String [] args){
        ArrayList<String> ar1 = new ArrayList<String>();
        ar1.add("java");
        ar1.add("python");
        ar1.add("ruby");
        ar1.add("html");

        //System.out.println(ar1.size());

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("dev");
        ar2.add("qa");

        // System.out.println(ar1.addAll(ar2)); //returns true if it changes the result
       // System.out.println(ar1); //addAll method adds ar1 with ar2
        ar1.addAll(2,ar2); //it adds the arrayList from the given index
       //  System.out.println(ar1);

       //  ar1.clear(); //clear method
       // System.out.println(ar1);

       //clone the ArrayList
        ArrayList<String> clone = (ArrayList<String>)ar1.clone();
        System.out.println(clone);

        ArrayList<String> clone2 = (ArrayList<String>) ar2.clone();
        System.out.println(clone2);

        //contains method returns boolean
        System.out.println(ar1.contains("ruby"));

        //lastIndexOf method & asList method
        ArrayList<String> list = new ArrayList<>(Arrays.asList("sm","po","tom","sc","peter","tom","john","tom"));
        int i = list.lastIndexOf("tom"); //returns the last index of occurrence
        System.out.println(i);
        int i1 = list.lastIndexOf("shahid");// this gives -1. doesn't give any exception
        System.out.println(i1);
    }
}
