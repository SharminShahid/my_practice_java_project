package inheritance;

public class Vehicle {
    //It is possible to inherit the methods and attribute from one clas to another.
    // to inherit we use extends keyword.
    //the class that inherit from another is SubClass.
    //SuperClass is the parent class, from which subClass is inherited.
    //Inheritance is usefull for code reusability.
    //final keyword in a class means the class can't be inherited.

    protected String carName ="Ford";
    protected void carMethod(){
        System.out.println("tut tut");
    }
}
