package FarmSimulator.Inheritance;

import FarmSimulator.Abstraction.Farm;
import FarmSimulator.Encapsulation.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropFarm extends Farm {
    private List<Crop> crops;

    public CropFarm(String ownerName) {
        super(ownerName);
        crops = new ArrayList<>();
    }

    public void plantCrop(Crop crop) {
        crops.add(crop);
        System.out.println("Menanam " + crop.getName());
    }

    public void harvestCrops() {
        for (Crop crop : crops) {
            if (!crop.isHarvested()) {
                crop.harvest();
                System.out.println(crop.getName() + " berhasil dipanen!");
            }
        }
    }

    @Override
    public void manageFarm() {
        System.out.println("Mengelola ladang milik " + ownerName);
        harvestCrops();
    }
}
