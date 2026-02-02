package Interazione;
import java.sql.SQLOutput;
import java.util.Scanner;
import Gestione.ArrayDinamico;


public class CUI {

    static ArrayDinamico a = new ArrayDinamico();
    static Scanner vsc = new Scanner(System.in);
    static private int scelta;

    public static void Menu(){
        do {
            System.out.println("""
                    ---MENU---
                    
                    1. Aggiungi prodotto alla lista
                    2. Rimuovi prodotto dalla lista
                    3. Ricerca prodotto usando l'indice
                    4. Ricerca prodotto usando le caratteristiche
                    5. Pulisci lista
                    6. Modifica grandezza lista
                    7. Verifica esistenza prodotto
                    8. Stampa lista
                    0. ESCI (GET OUTTTTTT!!!!!!!)
                    
                    """);
            scelta=vsc.nextInt();
            switch (scelta) {
                case 1:
                    a.Add();
                    break;
                case 2:
                    a.Remove();
                    break;
                case 3:
                    a.Get();
                    break;
                case 4:
                    a.IndexOf();
                    break;
                case 5:
                    a.Clear();
                    break;
                case 6:
                    a.Size();
                    break;
                case 7:
                    a.Contains();
                    break;
                case 8:
                    a.ToArray();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("valore non valido");
                    break;
            }
        }while(scelta!=0);
    }

    public static void MenuRicerca(){
        System.out.println("""
                ---MENU---
                1.cerca prodotto
                2.cerca podotto per tipo
                3.cerca prodotto per marca
                4.cerca prodotto per anno
                ----------
                """);
    }

    public static int input(){
        return vsc.nextInt();
    }

    public static String inputS(){
        return vsc.next();
    }


}
