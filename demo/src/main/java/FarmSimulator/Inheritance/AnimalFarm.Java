package FarmSimulator.Inheritance;

import FarmSimulator.Abstraction.Farm;
import FarmSimulator.Encapsulation.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm extends Farm {
    private List<Animal> animals;

    public AnimalFarm(String ownerName) {
        super(ownerName);
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Menambahkan hewan: " + animal.getName());
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
            animal.checkHealth();
            System.out.println(animal.getName() + " telah diberi makan.");
        }
    }

    @Override
    public void manageFarm() {
        System.out.println("Mengelola peternakan milik " + ownerName);
        feedAnimals();
    }
}
