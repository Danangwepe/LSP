package buwong.refactoring;

public class Parrot implements FlyingBird, WalkingBird {
    public void fly() {
        System.out.println("Fly High");
    }

    public void walk() {
        System.out.println("Walking walking");
    }
}
