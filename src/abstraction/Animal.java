package abstraction;

public abstract class Animal {
    public abstract void animalSound(); //abstract method-- no body

    public void animalSleep(){
        System.out.println("zzzzz"); //non abstract method--- with body
    }

}
