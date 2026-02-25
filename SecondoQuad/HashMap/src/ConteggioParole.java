import java.util.HashMap;

public class ConteggioParole {
    private HashMap<String, Integer> mappaParole;

    public ConteggioParole() {
        mappaParole = new HashMap<>();
    }

    public void aggiungiParola(String parola){
        parola = parola.toLowerCase();

        if(mappaParole.containsKey(parola)){
            mappaParole.put(parola, mappaParole.get(parola)+1);
        }else{
            mappaParole.put(parola, 1);
        }
    }

    public void stampaTutto(){
        mappaParole.forEach((k,v) -> System.out.println("parola: "+k.toUpperCase()+" ---contenuta ---"+v+"--- volte "));
    }
}
