import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String testo;
        Scanner sc = new Scanner(System.in);
        ConteggioParole conteggioParole = new ConteggioParole();

        System.out.println("inserisci testo: ");
        testo=sc.nextLine();

        String[] parole = testo.split(" ");

        for (int i = 0; i < parole.length; i++) {
            conteggioParole.aggiungiParola(parole[i]);
        }

        conteggioParole.stampaTutto();

    }
}