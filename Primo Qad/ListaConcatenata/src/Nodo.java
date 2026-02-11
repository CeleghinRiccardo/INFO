public class Nodo {
    private String dato;
    private Nodo succ;
    public Nodo(String dato) {
        this.succ = null;
        this.dato = dato;
    }

    public Nodo(Nodo succ, String dato) {
        this.succ = succ;
        this.dato = dato;
    }

    public Nodo getSucc() {
        return succ;
    }

    public void setSucc(Nodo succ) {
        this.succ = succ;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void aggiungiNodo(){

    }

}
