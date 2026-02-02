public class Libro {
    private String titolo, autore ,casaEd;
    private int pagMax;
    Pagina[] pagine = new Pagina[pagMax];

    public Libro(String titolo, String autore, int pagMax){
        this.autore=autore;
        this.titolo=titolo;
        this.pagMax=pagMax;
    }

    public Libro(String titolo, String autore, int pagMax, String casaEd){
        this.autore=autore;
        this.titolo=titolo;
        this.pagMax=pagMax;
        this.casaEd=casaEd;
    }

    public String getAutore() {return autore;}
    public void setAutore(String autore) {this.autore = autore;}
    public String getTitolo() {return titolo;}
    public void setTitolo(String titolo) {this.titolo = titolo;}
    public String getCasaEd() {return casaEd;}
    public void setCasaEd(String casaEd) {this.casaEd = casaEd;}
    public int getPagMax() {return pagMax;}
    public void setPagMax(int pagMax) {this.pagMax = pagMax;}

    public void stampaInfo() {
        System.out.println("---INFO---" + "\n" +
                "titolo: " + getTitolo() + "\n"+
                "autore: "+ getAutore()+"\n"+
                "casa editrice: "+getCasaEd());
    }

    public void popola(){
        for (int i = 0; i <= pagine.length; i++){
            pagine[i]= new Pagina("....",i+1);
        }
    }

}
