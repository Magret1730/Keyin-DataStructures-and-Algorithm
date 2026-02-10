package org.codewithmagret;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue("dog", "Bingo");
        shelter.enqueue("cat", "Mimi");
        shelter.enqueue("cat", "Tom");
        shelter.enqueue("dog", "Rabit");
        shelter.enqueue("dog", "Rex");
        shelter.enqueue("dog", "Scooby Doo");

        System.out.println();
//
        System.out.println("Adopted Animal: " + shelter.dequeueAny().name);
        System.out.println("Adopted Dog: " + shelter.dequeueDog().name);
        System.out.println("Adopted Cat: " + shelter.dequeueCat().name);
        System.out.println("Adopted Animal: " + shelter.dequeueAny().name);
    }
}
