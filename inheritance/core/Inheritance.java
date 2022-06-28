package inheritance.core;

import javax.swing.SortingFocusTraversalPolicy;

public class Inheritance {

    public static void main(String[] args) {

        // Animal animal = new Animal("Animal", 1, 1, 5, 5);
        // Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");

        // dog.eat();
        // dog.walk();
        // dog.run();
        // animal.eat();

        // Fish fish = new Fish("Guppy", 5, 6, 2, 2, 2);
        // fish.eat();
        // fish.swim(10);

        // Vehicle vehicle = new Vehicle();
        // System.out.println(vehicle.getBrand());
        // System.out.println(vehicle.getCurrentGear());
        // System.out.println(vehicle.getCurrentSpeed());
        // vehicle.startVehicle();
        // vehicle.startVehicle();
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        // vehicle.braking(10);
        // vehicle.accelerate(80);
        // vehicle.accelerate(20);
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        // vehicle.accelerate(20);
        // vehicle.braking(50);
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());

        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }

}