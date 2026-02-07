package Gestione;
import Code.Pila;
import Code.Blocco;

public class CUI {

    static Pila<Blocco> pila1= new Pila<>();
    static Pila<Blocco> pila2= new Pila<>();
    static Pila<Blocco> pila3= new Pila<>();
    static Blocco b1 = new Blocco(1);
    static Blocco b2 = new Blocco(2);
    static Blocco b3 = new Blocco(3);
    static int  i = 0;

    public static void menu(){
        do {

            System.out.println(pila1.toString());
            System.out.println(pila2.toString());
            System.out.println(pila3.toString());

            System.out.println("Fai la tua mossa: ");

        }while (i==0);
    }
}
