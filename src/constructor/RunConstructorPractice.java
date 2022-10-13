package constructor;

public class RunConstructorPractice {
    public static void main(String[] args){

        ConstructorPractice obj = new ConstructorPractice();
        ConstructorPractice practice = new ConstructorPractice(6,"Jony");
        System.out.println(practice.x);
        System.out.println(practice.name);
    }
}
