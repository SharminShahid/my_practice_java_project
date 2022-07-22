package exercise;

public class NullArgument {
    // pass null argument with method overloading with object and string types

    //creating two different methods with same name and one with object parameter another with String parameter

    public static void test(Object ob){ // superclass of all classes
        System.out.println("object argument");
    }
    public static void test(String st){
        System.out.println("String argument");
    }
    public static void main(String[] args){ // it will call string argument as it is more obvious
        test(null);
    }
}
