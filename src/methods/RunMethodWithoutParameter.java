package methods;

public class RunMethodWithoutParameter {
    //Question---- How can we access to a class properties from another class.
    //Answer----- By creating an object of the class (object is the keyword)
    //object syntax: Classname objectName = new classname

    public static void main(String[] args){
       // MethodWithoutParameter mwp = new MethodWithoutParameter();
       // mwp.myMethod();

        //no need to create the object as MethodWithoutParameter is a static method.
        //we can call it with class name only.

        MethodWithoutParameter.myMethod();

    }

}
