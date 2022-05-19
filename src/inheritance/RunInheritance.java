package inheritance;

public class RunInheritance {
    public static void main (String[] args){
        Car obj = new Car();
        System.out.println(obj.carName);
        obj.carMethod();
        System.out.println(obj.model);
    }
}
