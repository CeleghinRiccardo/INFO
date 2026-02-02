public class LibroDigitale extends Libro implements Consultabile{

    public LibroDigitale(String titolo, String autore, int pagMax){
        super (titolo, autore, pagMax);
    }
    public LibroDigitale(String titolo, String autore, int pagMax, String casaEd){
        super(titolo, autore, pagMax, casaEd);
    }

    @Override
    public void stampa() {
        System.out.println("Stampo Libro...");
    }

    @Override
    public void consultaOnline() {
        System.out.println("Per consiltare il libro Online andare su 'https//ciao.com'");
    }

    @Override
    public void stampaInfo() {
        System.out.println("---INFO---" + "\n" +
                "titolo: " + getTitolo() + "\n" +
                "autore: " + getAutore() + "\n" +
                "casa editrice: " + getCasaEd() +"\n"+
                "spazio file: " + getPagMax() * 100 + "byte");
    }
}
