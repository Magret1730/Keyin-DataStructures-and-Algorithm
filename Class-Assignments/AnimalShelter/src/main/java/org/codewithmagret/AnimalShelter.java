package org.codewithmagret;

public class AnimalShelter {
    private AnimalQueue dogQueue = new AnimalQueue();
    private AnimalQueue catQueue = new AnimalQueue();
    private int counter = 0;

    public void enqueue(String type, String name) {
        String lowercaseType = type.toLowerCase();

        if (!lowercaseType.equals("dog") && !lowercaseType.equals("cat")) {
            System.out.println("Invalid animal type. Only dogs and cats are allowed.");
            return;
        }

        Animal animal = new Animal(lowercaseType, name, counter++);

        if (lowercaseType.equals("dog")) {
            dogQueue.enqueue(animal);
            System.out.println("Dog " + name + " has been added to the shelter.");
        } else {
            catQueue.enqueue(animal);
            System.out.println("Cat " + name + " has been added to the shelter.");
        }
    }

    public  Animal dequeueAny() {
        if (dogQueue.isEmpty() && catQueue.isEmpty()) {
            System.out.println("No animals available for adoption.");
            return null;
        } else if (dogQueue.isEmpty()) {
            return catQueue.dequeue();
        } else if (catQueue.isEmpty()) {
            return dogQueue.dequeue();
        }

        Animal dog = dogQueue.peek();
        Animal cat = catQueue.peek();

        if (dog.order < cat.order) {
            return dogQueue.dequeue();
        } else {
            return catQueue.dequeue();
        }
    }

    public Animal dequeueDog() {
        if (dogQueue.isEmpty()) {
            System.out.println("No dogs available for adoption.");
            return null;
        }
        return dogQueue.dequeue();
    }

    public Animal dequeueCat() {
        if (catQueue.isEmpty()) {
            System.out.println("No cats available for adoption.");
            return null;
        }
        return catQueue.dequeue();
    }
}
