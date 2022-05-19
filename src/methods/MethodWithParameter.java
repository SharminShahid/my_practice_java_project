package methods;

public class MethodWithParameter {

    //information that are passed in a method is called parameters
    //when parameter value is passed inside a method they are called arguments.
    //name, age are parameters and jany,jack,12,23 etc are arguments.
    static void myMethod(String name,int age){
        System.out.println(name +  " is "  + age);
    }
    //calling the method with multiple parameters.
    public static void main(String[] args){
        myMethod("jany", 12);
        myMethod("jack",23);
        myMethod("anna",15);
    }
    //void methods are non return method.

}
