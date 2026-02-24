public class Nodo {


    private int dato;
    private Nodo destra;
    private Nodo sinistra;
    private int chiave;


    public Nodo(int chiave, Nodo sinistra, Nodo destra, int dato) {
        this.chiave = chiave;
        this.sinistra = null;
        this.destra = null;
        this.dato = dato;
    }

    public int getDato() {return dato;}

    public Nodo getDestra() {return destra;}

    public void setDestra(Nodo destra) {this.destra = destra;}

    public Nodo getSinistra() {return sinistra;}

    public void setSinistra(Nodo sinistra) {this.sinistra = sinistra;}

    public int getChiave() {return chiave;}


}




