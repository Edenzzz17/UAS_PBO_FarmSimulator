package FarmSimulator.Encapsulation;

public class Crop {
    private String name;
    private int growthTime; // in days
    private boolean isHarvested;

    public Crop(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
        this.isHarvested = false;
    }

    public String getName() {
        return name;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public boolean isHarvested() {
        return isHarvested;
    }

    public void harvest() {
        isHarvested = true;
    }
}
