package TebakKataProject.Inheritance;

import TebakKataProject.Abstraction.Game;

public class TebakKataGame extends Game {
    
    public TebakKataGame(String kata, int kesempatan) {
        super(kata, kesempatan); 
    }

    @Override
    public void playGame() {
        System.out.println("Permainan dimulai! Tebak kata.");
    }
}
