package Gestione;
import Code.Pila;
import Code.Blocco;

public class CUI {

    private static Pila<Blocco> pila1= new Pila<>();
    private static Pila<Blocco> pila2= new Pila<>();
    private static Pila<Blocco> pila3= new Pila<>();
    private static Blocco b1 = new Blocco(1);
    private static Blocco b2 = new Blocco(2);
    private static Blocco b3 = new Blocco(3);
    private static int  i = 0;

    public static void menu(){
        do {

            System.out.println(pila1.toString());
            System.out.println(pila2.toString());
            System.out.println(pila3.toString());

            System.out.println("Fai la tua mossa: ");

        }while (i==0);
    }
}
