package hu.webler;

import hu.webler.domain.*;

public class BiologyPhysiologyApp {

    public static void main(String[] args) {

        LivingCreature emptyCarnivore = new Carnivore();

        Herbivore rabbit = new Herbivore("Rabbit", 2, new String[] {"White"}, "Female");
        System.out.println(rabbit);
        System.out.println(emptyCarnivore);
        int counter = LivingCreature.getCreatureCounter();
        System.out.println(counter);

        counter = LivingCreature.getCreatureCounter();
        System.out.println(counter);

        Omnivore bear = new Omnivore("Bear", 3, new String[] {"Brown"}, "Male");
        System.out.println(bear);

        Carnivore lion = new Carnivore("Lion", 5, new String[] {"Brown", "Gold", "White"}, "Male");
        System.out.println(lion);
        lion.feed(); // Carnivore
        Animal animalCarnivore = new Carnivore("AnimCarni", 100, null, "xxx");
        System.out.println(animalCarnivore);
        animalCarnivore.feed(); // Animal
        bear.feed(); // Omnivore
        rabbit.feed(); // Herbivore
    }
}