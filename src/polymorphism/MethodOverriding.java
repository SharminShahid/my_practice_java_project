package polymorphism;

public class MethodOverriding extends MethodOverLoading{
    //same method name same parameter with different body.
    @Override

    void multiplication(int x, int y){
        System.out.println(x*y);
    }

}
