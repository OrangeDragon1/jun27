package inheritance.core;

public class Inheritance {

    public static void main(String[] args) {

        // Animal animal = new Animal("Animal", 1, 1, 5, 5);
        // Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");

        // dog.eat();
        // dog.walk();
        // dog.run();
        // animal.eat();

        Fish fish = new Fish("Guppy", 5, 6, 2, 2, 2);
        fish.eat();
        fish.swim(10);
    }

}