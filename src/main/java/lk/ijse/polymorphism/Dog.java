package lk.ijse.polymorphism;

public class Dog extends Animal {
    @Override
    public void run(){
        System.out.println("This is run() of Dog.");
    }

    @Override
    public void run(int speed){
        System.out.println("This is run(speed) of Dog.");
    }
}