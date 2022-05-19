package listandset;

import java.util.HashMap;

public class HashMapClass {
    //HashMaps store items in keys/values pair.
    public static void main(String[] args){
        HashMap<String,Integer> student = new HashMap<String,Integer>();
        student.put("jony", 2);
        student.put("curly", 3);
        student.put("maya",9);
        student.put("limbert", 8);

        System.out.println(student.size());
        System.out.println(student.get("jony"));
    }
}
