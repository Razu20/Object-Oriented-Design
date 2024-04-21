//*************************************************************************
// Title : Java Program Demonstrating Interface Segregation Principle
// Author :Razu Sarder, Undergraduate Student, Khulna University
//*************************************************************************

import java.util.ArrayList;
import java.util.List;

// Interface representing the ability to fly
interface Flyable {
    void fly();
}

// Interface representing the ability to swim
interface Swimmable {
    void swim();
}

// Interface representing the ability to walk
interface Walkable {
    void walk();
}

// Class representing a Bird that can fly and walk
class Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }
}

// Class representing a Fish that can swim
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

// Demo class demonstrating the usage of animals and the Interface Segregation Principle
public class InterfaceSegregationPrincipleDemo {
    public static void main(String[] args) {
        // Create a list of animals
        List<Object> animals = new ArrayList<>();
        animals.add(new Bird());
        animals.add(new Fish());

        // Perform actions on each animal
        for (Object animal : animals) {
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
            if (animal instanceof Walkable) {
                ((Walkable) animal).walk();
            }
            System.out.println();
        }
    }
}

/**
 * In the above program, each interface represents a specific behavior
 * such as flying, swimming, and walking, adhering to the Interface
 * Segregation Principle. This approach allows classes like Bird and Fish
 * to implement only the interfaces relevant to their capabilities,
 * promoting better code organization and maintainability.
 */   
