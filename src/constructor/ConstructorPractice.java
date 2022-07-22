package constructor;

public class ConstructorPractice {
    int x;
    String name;

    public ConstructorPractice(){
        System.out.println("default constructor");
    }

    public ConstructorPractice(int x, String name) {
        this.x = x;
        this.name = name;
    }
}
