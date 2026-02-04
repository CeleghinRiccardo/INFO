package PACKAGE_NAME;
import java.util.ArrayList;

public class ListinoPrezzi {
    private ArrayList<Prodotto> prodotti;

    public ListinoPrezzi() {
        prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(String nome, double prezzo) {
        prodotti.add(new Prodotto(nome, prezzo));
    }

    public void visualizzaListino() {
        if (prodotti.isEmpty()) {
            System.out.println("Listino vuoto");
            return;
        }
        for (Prodotto p : prodotti) {
            System.out.println(p);
        }
    }

    public Prodotto cercaProdotto(String nome) {
        for (Prodotto p : prodotti) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public boolean rimuoviProdotto(String nome) {
        Prodotto p = cercaProdotto(nome);
        if (p != null) {
            prodotti.remove(p);
            return true;
        }
        return false;
    }

    public double prezzoMedio() {
        if (prodotti.isEmpty()) return 0;
        double somma = 0;
        for (Prodotto p : prodotti) {
            somma += p.getPrezzo();
        }
        return somma / prodotti.size();
    }

    public void ordinaPerNome() {
        for (int i = 0; i < prodotti.size() - 1; i++) {
            for (int j = i + 1; j < prodotti.size(); j++) {
                if (prodotti.get(i).getNome().compareToIgnoreCase(prodotti.get(j).getNome()) > 0) {
                    Prodotto temp = prodotti.get(i);
                    prodotti.set(i, prodotti.get(j));
                    prodotti.set(j, temp);
                }
            }
        }
    }

    public void ordinaPerPrezzo() {
        for (int i = 0; i < prodotti.size() - 1; i++) {
            for (int j = i + 1; j < prodotti.size(); j++) {
                if (prodotti.get(i).getPrezzo() > prodotti.get(j).getPrezzo()) {
                    Prodotto temp = prodotti.get(i);
                    prodotti.set(i, prodotti.get(j));
                    prodotti.set(j, temp);
                }
            }
        }
    }

    public boolean aggiornaPrezzo(String nome, double nuovoPrezzo) {
        Prodotto p = cercaProdotto(nome);
        if (p != null) {
            p.setPrezzo(nuovoPrezzo);
            return true;
        }
        return false;
    }

    public Prodotto prodottoPiuCaro() {
        if (prodotti.isEmpty()) return null;
        Prodotto max = prodotti.get(0);
        for (Prodotto p : prodotti) {
            if (p.getPrezzo() > max.getPrezzo()) {
                max = p;
            }
        }
        return max;
    }

    public Prodotto prodottoPiuEconomico() {
        if (prodotti.isEmpty()) return null;
        Prodotto min = prodotti.get(0);
        for (Prodotto p : prodotti) {
            if (p.getPrezzo() < min.getPrezzo()) {
                min = p;
            }
        }
        return min;
    }

    public int numeroProdotti() {
        return prodotti.size();
    }
}