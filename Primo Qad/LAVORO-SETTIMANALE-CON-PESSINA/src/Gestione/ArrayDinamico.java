package Gestione;
import Interazione.CUI;


public class ArrayDinamico implements Lista {
    private int puntatore = 0;
    private int l=1;
    private int s;
    private String tipo, marca;
    private int anno;
    private Prodotto[] Lista = new Prodotto[l];
    private int scelta;

    public void riordinaLista(){
        for(int i = 0; i < Lista.length-1; i++){
            for(int j=0; j<Lista.length-1; j++){
                if (Lista[j]==null) {
                    Lista[j] = Lista[j + 1];
                    Lista[j + 1] = null;
                }
            }
        }
    }

    @Override
    public void Add() {
        l++;
        System.out.println("CARO, inserisci il TIPO, la MARCA, e l'ANNO");
        Lista[puntatore]= new Prodotto(CUI.inputS(),CUI.inputS(),CUI.input());
        System.out.println(Lista[puntatore].toString());
        puntatore++;
    }

    @Override
    public void Get() {
        System.out.println("Inserisci indice prodotto che vuoi cercare: ");
        System.out.println(Lista[CUI.input()].toString());
    }

    @Override
    public void Remove() {
        do {
            System.out.println("Inserisci l'indice del prodotto da rimuovere:");
            scelta = CUI.input();
            if (scelta <= l) {
                Lista[scelta] = null;
            }else{
                System.out.println("Indice non trovato, RIPROVA");
            }
        }while (scelta > l);

    }
    @Override
    public void Size() {
        System.out.println("La grandezza dell'array è: "+l+"\n Inserisci la grandezza del nuovo array");

        s=CUI.input();

        if (s<l) {
            while (s < l) {
                System.out.println("Impossibile ridimensionare array, valore troppo piccolo\n Inserire nuovamente il valore:");
                s = CUI.input();
            }
        }else {
            l = s;
        }
    }

    @Override
    public void Contains() {

        CUI.MenuRicerca();
        switch (CUI.input()){
            case 1:
                System.out.println("inserisci tipo");
                tipo=CUI.inputS();
                System.out.println("inserisci marca");
                marca=CUI.inputS();
                System.out.println("inserisci anno");
                anno=CUI.input();

                for(int i = 0; i < Lista.length; i++){
                    if(Lista[i].getTipo().equalsIgnoreCase(tipo)&&Lista[i].getMarca().equalsIgnoreCase(marca)&&Lista[i].getAnno()==anno){
                        System.out.println("il prodotto si trova nella lista");
                    }else {
                        System.out.println("prodotto non trovato");
                    }
                }
                break;
            case 2:
                System.out.println("inserisci marca:");
                marca=CUI.inputS();
                for(int i = 0; i < Lista.length; i++){
                    if(Lista[i].getMarca().equalsIgnoreCase(marca)){
                        System.out.println("il prodotto si trova nella lista");
                    }else {
                        System.out.println("prodotto non trovato");
                    }
                }
                break;
            case 3:
                System.out.println("inserisci tipo:");
                tipo=CUI.inputS();
                for(int i = 0; i < Lista.length; i++){
                    if(Lista[i].getTipo().equalsIgnoreCase(tipo)){
                        System.out.println("il prodotto si trova nella lista");
                    }else {
                        System.out.println("prodotto non trovato");
                    }
                }
                break;
            case 4:
                System.out.println("inserisci anno:");
                anno=CUI.input();
                for(int i = 0; i < Lista.length; i++){
                    if(Lista[i].getAnno() == anno){
                        System.out.println("il prodotto si trova nella lista");
                    }else {
                        System.out.println("prodotto non trovato");
                    }
                }
                break;
        }


    }

    @Override
    public void IndexOf() {
            CUI.MenuRicerca();
            switch (CUI.input()){
                case 1:
                    System.out.println("inserisci tipo");
                    tipo=CUI.inputS();
                    System.out.println("inserisci marca");
                    marca=CUI.inputS();
                    System.out.println("inserisci anno");
                    anno=CUI.input();

                    for(int i = 0; i < Lista.length; i++){
                        if(Lista[i].getTipo().equalsIgnoreCase(tipo)&&Lista[i].getMarca().equalsIgnoreCase(marca)&&Lista[i].getAnno()==anno){
                            System.out.println("il prodotto si trova all'indice: "+i);
                        }else {
                            System.out.println("prodotto non trovato");
                        }
                    }
                    break;
                case 2:
                    System.out.println("inserisci marca:");
                    marca=CUI.inputS();
                    for(int i = 0; i < Lista.length; i++){
                        if(Lista[i].getMarca().equalsIgnoreCase(marca)){
                            System.out.println("il prodotto si trova all'indice: "+i);
                        }else {
                            System.out.println("prodotto non trovato");
                        }
                    }
                    break;
                case 3:
                    System.out.println("inserisci tipo:");
                    tipo=CUI.inputS();
                    for(int i = 0; i < Lista.length; i++){
                        if(Lista[i].getTipo().equalsIgnoreCase(tipo)){
                            System.out.println("il prodotto si trova all'indice: "+i);
                        }else {
                            System.out.println("prodotto non trovato");
                        }
                    }
                    break;
                case 4:
                    System.out.println("inserisci anno:");
                    anno=CUI.input();
                    for(int i = 0; i < Lista.length; i++){
                        if(Lista[i].getAnno() == anno){
                            System.out.println("il prodotto si trova all'indice: "+i);
                        }else {
                            System.out.println("prodotto non trovato");
                        }
                    }
                    break;
            }

    }

    @Override
    public void Clear() {
        for(int i=0; i < Lista.length; i++){
            Lista[i] = null;
        }
    }

    @Override
    public void  ToArray() {
        for (Prodotto prodotto : Lista) {
            System.out.println(prodotto);
        }
    }
}

