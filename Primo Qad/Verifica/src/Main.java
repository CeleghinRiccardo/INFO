public class Main {
    public static void main(String[] args) {

        LibroDigitale l = new LibroDigitale("Ciao","Riccardo", 90);


        l.popola();
        if(l.getCasaEd()==null){
            l.setCasaEd("non disponibile");
        }

        l.stampaInfo();
        System.out.println();
        l.consultaOnline();
        System.out.println();
        l.stampa();
    }
}