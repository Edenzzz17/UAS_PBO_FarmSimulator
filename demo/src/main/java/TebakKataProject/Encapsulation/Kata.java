package TebakKataProject.Encapsulation;

public class Kata {
    private String kata;
    private char[] tebakan;

    public Kata(String kata) {
        this.kata = kata;
        this.tebakan = new char[kata.length()];
        for (int i = 0; i < kata.length(); i++) {
            tebakan[i] = '_'; 
        }
    }

    public String getKata() {
        return kata;
    }

    public char[] getTebakan() {
        return tebakan;
    }

    public boolean updateTebakan(char huruf) {
        boolean ditemukan = false;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == huruf && tebakan[i] == '_') {
                tebakan[i] = huruf;
                ditemukan = true;
            }
        }
        return ditemukan;
    }
}
