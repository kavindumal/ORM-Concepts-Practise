package lk.ijse.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.run();
        animal.run(10);
    }
}