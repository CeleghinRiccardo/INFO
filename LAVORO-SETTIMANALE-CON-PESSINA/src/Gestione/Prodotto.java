package Gestione;
import Interazione.CUI;

public class Prodotto {

    private String tipo, marca;
    private int anno;

    public Prodotto(String tipo, String marca, int anno) {
        this.tipo = tipo;
        this.marca = marca;
        this.anno = anno;
    }

    public String getTipo() {return tipo;}
    public String getMarca() {return marca;}
    public int getAnno() {return anno;}

    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setAnno(int anno) {this.anno = anno;}

    @Override
    public String toString() {
        return "Prodotto{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", anno=" + anno +
                '}';
    }
}
