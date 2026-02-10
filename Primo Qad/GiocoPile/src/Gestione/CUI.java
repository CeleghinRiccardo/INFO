package Gestione;
import Code.Pila;
import Code.Blocco;

import java.util.ArrayList;
import java.util.Scanner;

public class CUI {

    private Pila<Blocco> pila1= new Pila<>();
    private Pila<Blocco> pila2= new Pila<>();
    private Pila<Blocco> pila3= new Pila<>();
    private Blocco b1 = new Blocco(1);
    private Blocco b2 = new Blocco(2);
    private Blocco b3 = new Blocco(3);
    private int i = 0;
    private int z = 0;
    int x;

    Scanner sc = new Scanner(System.in);


    public CUI(){
        pila1.push(b3);
        pila1.push(b2);
        pila1.push(b1);
    }


    public void menu(){
        do {

            System.out.println("MENU PRINCIPALE");
            System.out.println("1) GIOCA");
            System.out.println("2) VISUALIZZA PILE");
            System.out.println("3) ESCI");
            x = sc.nextInt();

            switch(x){
                case 1:
                    gioco();
                    break;

                case 2:
                    System.out.println(pila1.toString());
                    System.out.println(pila2.toString());
                    System.out.println(pila3.toString());
                    break;

                case 3:
                    i++;
                    break;

                default :
                    System.out.println("input non valido");
                    break;

            }
        }while (i==0);
    }

    public void gioco(){

        do {
            System.out.println(pila1.toString());
            System.out.println(pila2.toString());
            System.out.println(pila3.toString());

            System.out.println("PILA INIZIO: 1");
            System.out.println("PILA FINE: 3");
            System.out.println("FAI LA TUA MOSSA: ");

            System.out.println("1) SPOSTA BLOCCO");
            System.out.println("2) ARRENDITI");
            x=sc.nextInt();

            switch (x){
                case 1:

                    break;
                case 2:
                    System.out.println("TI SEI ARRESOOOO!!!!");
                    break;

                default:
                    System.out.println("VALORE NON VALIDO");
                    break;

            }


            if(pila3.top()==b3 && pila3.get(1)==b2&& pila3.get(0)==b1){
                System.out.println("HAI VINTOOOOOOOOO!!!!!");
                break;
            }
            z++;
        }while(z==0);
    }
}
