package coleccion;

import modelo.Corrida;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

@SuppressWarnings("Since15")
public class CorridaIterator implements Iterator <Corrida>{
    private int index = 0;
    private ArrayList<Corrida> lista;

    public CorridaIterator(ArrayList<Corrida> lista){
        this.index = -1;
        this.lista = lista;
    }

    public boolean hasNext() {
        return index<lista.size() && lista.get(index) != null;
    }

    public Corrida next() {
        if(hasNext())
            return lista.get(++index);
        return null;
    }

    public void forEachRemaining(Consumer<? super Corrida> action) {
        for(int i = index; i<lista.size();i++){
            action.accept(lista.get(i));
        }
    }
}
