package PACKAGE_NAME;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListinoPrezzi listino = new ListinoPrezzi();
        int scelta;

        do {
            System.out.println("\n1 Inserisci prodotto");
            System.out.println("2 Visualizza listino");
            System.out.println("3 Cerca prodotto");
            System.out.println("4 Rimuovi prodotto");
            System.out.println("5 Prezzo medio");
            System.out.println("6 Ordina per nome");
            System.out.println("7 Ordina per prezzo");
            System.out.println("8 Aggiorna prezzo");
            System.out.println("9 Prodotto più caro e più economico");
            System.out.println("10 Numero prodotti");
            System.out.println("0 Esci");
            System.out.print("Scelta: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    listino.aggiungiProdotto(nome, prezzo);
                    break;

                case 2:
                    listino.visualizzaListino();
                    break;

                case 3:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    Prodotto p = listino.cercaProdotto(nome);
                    System.out.println(p != null ? p : "Non trovato");
                    break;

                case 4:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.println(listino.rimuoviProdotto(nome) ? "Rimosso" : "Non trovato");
                    break;

                case 5:
                    System.out.println("Prezzo medio: " + listino.prezzoMedio());
                    break;

                case 6:
                    listino.ordinaPerNome();
                    System.out.println("Ordinato per nome");
                    break;

                case 7:
                    listino.ordinaPerPrezzo();
                    System.out.println("Ordinato per prezzo");
                    break;

                case 8:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Nuovo prezzo: ");
                    prezzo = scanner.nextDouble();
                    System.out.println(listino.aggiornaPrezzo(nome, prezzo) ? "Aggiornato" : "Non trovato");
                    break;

                case 9:
                    Prodotto caro = listino.prodottoPiuCaro();
                    Prodotto economico = listino.prodottoPiuEconomico();
                    if (caro != null) {
                        System.out.println("Più caro: " + caro);
                        System.out.println("Più economico: " + economico);
                    } else {
                        System.out.println("Listino vuoto");
                    }
                    break;

                case 10:
                    System.out.println("Totale prodotti: " + listino.numeroProdotti());
                    break;
            }

        } while (scelta != 0);

        scanner.close();
    }
}