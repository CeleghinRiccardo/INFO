import java.util.ArrayList;

public class Pila <E>{

    private ArrayList<E> elementi;
    private int i;

    public Pila(){
        elementi = new ArrayList<>();
    }

    public void push(E obj){
        elementi.add(obj);
    }

    public E pop(){
        if(elementi.size()>0){
            return elementi.remove(elementi.size()-1);
        }
        return null;
    }

    public E top(){
        if(elementi.size()>0){
            return elementi.getLast();
        }
        return null;
    }

    public int size(){
        return elementi.size();
    }

    public boolean vuota(){
        if(elementi.size()>0){
            return false;
        }
        return true;
    }

    public void svuota(){
        elementi.clear();
    }
}
