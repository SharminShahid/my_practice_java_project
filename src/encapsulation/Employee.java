package encapsulation;

public class Employee {
    //Encapsulation is done to hide sensitive data from users.
    //we have to create get method and set method to access to this class
    private String name;
    private int age;
    private int salary;
    //private variables can only be accessed by the same class.

    //getter method- return method
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    //setter method - non return method

    public void setAge(int age) {
        this.age = age;
    }
    public void setname(String name) {
        this.name = name;
    }
}
