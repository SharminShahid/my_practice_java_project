package interfacePractice;

public class Animal implements Horse,Birds{
    @Override
    public void animalSound() {
        System.out.println("neigh neigh");
    }

    @Override
    public void animalSleep() {
        System.out.println("Horse sleeps a little");
    }

    @Override
    public void wings() {
        System.out.println("use wings to fly");
    }

    @Override
    public void eats() {
        System.out.println("small leafs and insects");

    }
}
