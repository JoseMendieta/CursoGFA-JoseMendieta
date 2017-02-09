package coleccion;

import modelo.Corrida;

import java.util.ArrayList;
import java.util.Iterator;

public class ListadoCorridas {

    private ArrayList<Corrida> lista = new ArrayList<Corrida>();
    private String nombre;

    public ArrayList<Corrida> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Corrida> lista) {
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CorridaIterator iterator(){
        return new CorridaIterator(lista);
    }
}
