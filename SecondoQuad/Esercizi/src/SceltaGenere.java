import java.util.HashMap;

public class SceltaGenere {
    private HashMap<String, String> listaGeneri;

    public SceltaGenere() {
        this.listaGeneri = listaGeneri;
    }

    public void aggiungiLibro(String titolo, String genere){
        if(listaGeneri.containsKey(titolo)){
            listaGeneri.put(titolo, listaGeneri.get(titolo)+1);
        }else{
            listaGeneri.put(titolo, genere);
        }
    }
}
