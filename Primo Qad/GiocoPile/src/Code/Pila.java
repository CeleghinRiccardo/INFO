package Code;

import java.util.ArrayList;

public class Pila <Blocco>{

    private ArrayList<Blocco> Pila;
    private int i;

    public Pila(){
        Pila = new ArrayList<>();
    }

    public void push(Blocco obj){
        Pila.add(obj);
    }

    public Blocco pop(){
        if(Pila.size()>0){
            return Pila.remove(Pila.size()-1);
        }
        return null;
    }

    public Blocco top(){
        if(Pila.size()>0){
            return Pila.getLast();
        }
        return null;
    }

    public int size(){
        return Pila.size();
    }

    public boolean vuota(){
        if(Pila.size()>0){
            return false;
        }
        return true;
    }

    public void svuota(){
        Pila.clear();
    }

    @Override
    public String toString() {
        return Pila.toString();
    }

}