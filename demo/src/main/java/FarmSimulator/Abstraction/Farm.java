package FarmSimulator.Abstraction;

import java.util.List;

public abstract class Farm {
    protected String ownerName;

    public Farm(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public abstract void manageFarm();
}