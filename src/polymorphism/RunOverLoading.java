package polymorphism;

public class RunOverLoading {
    public static void main(String[] args){
        MethodOverLoading myObj = new MethodOverLoading();


        System.out.println(myObj.plusMethod(90,777));
        System.out.println(myObj.plusMethod(6.77888, 8.87654));
        myObj.multiplication(88,65);
    }
}
