package introduction;

public class VariablePractice {
    //variables can be declared inside a class this are called class variable. can be used anywhere in the class.
    //Variables under class are called Global variable.
    //this keyword refers to global variables.

    static int a = 20;// declare the variable and assign the value.
    int num;   // declare variable without assign the value.

    //we can also declare a variable inside a method.
    // this is called local variable. this variable can not be used outside the method.
    //local variables are always prioritized.

    public static void main(String[] args){
        int x = 30; // local variable
        System.out.println(x);
        System.out.println(a); // inorder to use the class variable inside a static method we have to make the class
                               // variable static.

    }
    public void method(){
        this.num = 80; // using this keyword to declare the value of global variable inside a non-static method.
    }

}
