package polymorphism;
//Polymorphism is al about method overloading and method overriding

public class MethodOverLoading {
    //same method name with different parameters.
    public int plusMethod(int x, int y) {
        return x + y;
    }

    public double plusMethod(double x, double y){
        return x +y;


    }

    //same method name same parameter with different body.
    void multiplication(int x, int y) {
        System.out.println(x*y);

    }
}
