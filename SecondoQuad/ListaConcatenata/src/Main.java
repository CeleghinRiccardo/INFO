public class Main {
    public static void main(String[] args) {
        Nodo testa = new Nodo("Riccardo");
        Nodo n = new Nodo("Alex");
        Nodo intermedio = null;
        Nodo coda = new Nodo("Aldo");

        ListaConcatenata l = new ListaConcatenata(testa, coda,  2);

        l.Testa(n);
        l.Coda(testa);
        System.out.println(l.getTesta().getDato());
        System.out.println(l.getCoda().getDato());

    }
}