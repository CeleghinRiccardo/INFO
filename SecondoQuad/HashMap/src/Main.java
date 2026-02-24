import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String testo = "ciao mi chiamo riccardo come stai";
        ConteggioParole conteggioParole = new ConteggioParole();

        String[] parole = testo.split(" ");

        for (int i = 0; i < parole.length; i++) {
            conteggioParole.aggiungiParola(parole[i]);
        }

        conteggioParole.stampaTutto();

    }
}