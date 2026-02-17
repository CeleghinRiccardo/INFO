public class Nodo {
    private int dato;
    private Nodo succ;
    public Nodo(int dato) {
        this.succ = null;
        this.dato = dato;
    }

    public Nodo(Nodo succ, int dato) {
        this.succ = succ;
        this.dato = dato;
    }

    public Nodo getSucc() {
        return succ;
    }

    public void setSucc(Nodo succ) {
        this.succ = succ;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void aggiungiNodo(){

    }

}