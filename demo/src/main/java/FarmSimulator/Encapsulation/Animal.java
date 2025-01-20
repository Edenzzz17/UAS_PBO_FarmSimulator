package FarmSimulator.Encapsulation;

public class Animal {
    private String name;
    private int feedTimes; // how many times it has been fed
    private boolean isHealthy;

    public Animal(String name) {
        this.name = name;
        this.feedTimes = 0;
        this.isHealthy = true;
    }

    public String getName() {
        return name;
    }

    public int getFeedTimes() {
        return feedTimes;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void feed() {
        feedTimes++;
    }

    public void checkHealth() {
        isHealthy = feedTimes >= 2;
    }
}
