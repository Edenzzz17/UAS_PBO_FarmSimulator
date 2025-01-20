package FarmSimulator.Polymorphism;

import java.util.Scanner;

import FarmSimulator.Abstraction.Farm;
import FarmSimulator.Encapsulation.Animal;
import FarmSimulator.Encapsulation.Crop;
import FarmSimulator.Inheritance.AnimalFarm;
import FarmSimulator.Inheritance.CropFarm;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Farm Simulator!");
        
        // Membuat ladang tanaman
        System.out.print("Masukkan nama pemilik ladang tanaman: ");
        String cropFarmOwner = scanner.nextLine();
        Farm cropFarm = new CropFarm(cropFarmOwner);

        // Membuat peternakan
        System.out.print("Masukkan nama pemilik peternakan: ");
        String animalFarmOwner = scanner.nextLine();
        Farm animalFarm = new AnimalFarm(animalFarmOwner);

        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Kelola Ladang Tanaman");
            System.out.println("2. Kelola Peternakan");
            System.out.println("3. Keluar");
            System.out.print("Pilih aksi (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    manageCropFarm(scanner, (CropFarm) cropFarm);
                    break;
                case 2:
                    manageAnimalFarm(scanner, (AnimalFarm) animalFarm);
                    break;
                case 3:
                    gameRunning = false;
                    System.out.println("Terima kasih telah bermain! Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }

    private static void manageCropFarm(Scanner scanner, CropFarm cropFarm) {
        System.out.println("\n=== Kelola Ladang Tanaman ===");
        System.out.println("1. Tanam tanaman");
        System.out.println("2. Panen tanaman");
        System.out.print("Pilih aksi (1-2): ");
        int cropChoice = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        switch (cropChoice) {
            case 1:
                System.out.print("Masukkan nama tanaman: ");
                String cropName = scanner.nextLine();
                System.out.print("Masukkan waktu tumbuh tanaman (dalam hari): ");
                int growthTime = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                Crop crop = new Crop(cropName, growthTime);
                cropFarm.plantCrop(crop);
                break;
            case 2:
                cropFarm.manageFarm(); // Harvest crops
                break;
            default:
                System.out.println("Pilihan tidak valid. Kembali ke menu.");
                break;
        }
    }

    private static void manageAnimalFarm(Scanner scanner, AnimalFarm animalFarm) {
        System.out.println("\n=== Kelola Peternakan ===");
        System.out.println("1. Tambah hewan");
        System.out.println("2. Beri makan hewan");
        System.out.print("Pilih aksi (1-2): ");
        int animalChoice = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        switch (animalChoice) {
            case 1:
                System.out.print("Masukkan nama hewan: ");
                String animalName = scanner.nextLine();
                Animal animal = new Animal(animalName);
                animalFarm.addAnimal(animal);
                break;
            case 2:
                animalFarm.manageFarm(); // Feed animals
                break;
            default:
                System.out.println("Pilihan tidak valid. Kembali ke menu.");
                break;
        }
    }
}
