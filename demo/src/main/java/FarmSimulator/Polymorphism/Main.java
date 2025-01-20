package FarmSimulator.Polymorphism;

import FarmSimulator.Abstraction.Farm;
import FarmSimulator.Inheritance.CropFarm;
import FarmSimulator.Inheritance.AnimalFarm;
import FarmSimulator.Encapsulation.Crop;
import FarmSimulator.Encapsulation.Animal;

public class Main {
    public static void main(String[] args) {
        // Membuat ladang tanaman
        Farm cropFarm = new CropFarm("John");
        ((CropFarm) cropFarm).plantCrop(new Crop("Wheat", 7));
        ((CropFarm) cropFarm).plantCrop(new Crop("Corn", 5));

        // Mengelola ladang tanaman
        cropFarm.manageFarm();

        // Membuat peternakan
        Farm animalFarm = new AnimalFarm("Jane");
        ((AnimalFarm) animalFarm).addAnimal(new Animal("Cow"));
        ((AnimalFarm) animalFarm).addAnimal(new Animal("Chicken"));

        // Mengelola peternakan
        animalFarm.manageFarm();
    }
}
