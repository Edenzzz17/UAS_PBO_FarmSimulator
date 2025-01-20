package TebakKataProject.Polymorphism;

import java.util.Random;
import java.util.Scanner;

import TebakKataProject.Abstraction.Game;
import TebakKataProject.Inheritance.TebakKataGame;

public class Main {
    public static void main(String[] args) {
        String[] daftarKata = {"mangga", "apel", "jeruk", "pisang", "semangka", "durian"};
        
        
        Random random = new Random();
        String kataPilihan = daftarKata[random.nextInt(daftarKata.length)];
        
        
        Game game = new TebakKataGame(kataPilihan, 6); 
        game.playGame();
        
        Scanner scanner = new Scanner(System.in);  
        while (!game.isGameOver() && !game.isWon()) {
            
            System.out.print("Masukkan huruf: ");
            char huruf = scanner.next().charAt(0); 

            boolean ditemukan = game.getKata().updateTebakan(huruf); 
            if (!ditemukan) {
                game.decreaseKesempatan(); 
            }
            
            System.out.print("Tebakan saat ini: ");
            for (char c : game.getKata().getTebakan()) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        
        if (game.isWon()) {
            System.out.println("Selamat! Kamu menang!");
        } else {
            System.out.println("Game Over. Kesempatan habis.");
        }
        
        scanner.close();  
    }
}
