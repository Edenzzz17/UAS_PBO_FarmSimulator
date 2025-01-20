package TebakKataProject.Abstraction;

import TebakKataProject.Encapsulation.Kata;

public abstract class Game {
    protected Kata kata;
    protected int kesempatan;

    public Game(String kata, int kesempatan) {
        this.kata = new Kata(kata);
        this.kesempatan = kesempatan;
    }

    public abstract void playGame();

    public boolean isGameOver() {
        return kesempatan <= 0;
    }

    public boolean isWon() {
        String kataTebakan = new String(kata.getTebakan());
        return kataTebakan.equals(kata.getKata());
    }

    public int getKesempatan() {
        return kesempatan;
    }

    public void decreaseKesempatan() {
        kesempatan--;
    }

    public Kata getKata() {
        return kata;
    }
}
