import java.util.ArrayList;

public class ListaConcatenata {
    private Nodo testa;
    private Nodo coda;
    private int size;


    public ListaConcatenata(Nodo testa, Nodo coda, int size) {
        this.testa = testa;
        this.coda = coda;
        this.size = size;
    }

    public Nodo getCoda() {
        return coda;
    }

    public void setCoda(Nodo coda) {
        this.coda = coda;
    }

    public Nodo getTesta() {
        return testa;
    }

    public void setTesta(Nodo testa) {
        this.testa = testa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void Testa(Nodo obj){
        testa = obj;
    }

    public void Coda(Nodo obj){
        coda = obj;
    }


}

