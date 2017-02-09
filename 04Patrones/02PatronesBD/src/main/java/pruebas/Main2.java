package pruebas;

import bd.CorridaBD;
import coleccion.CorridaIterator;
import coleccion.ListadoCorridas;
import modelo.Corrida;

import java.sql.SQLException;
import java.util.Iterator;

/**
 * Created by ERP06 on 09/02/2017.
 */
public class Main2 {
    public static void main (String [] args){
        CorridaBD conexion = CorridaBD.getInstance();
        try {
            ListadoCorridas listadoCorridas = conexion.obtenerCorridas();
            System.out.println(listadoCorridas.getNombre());

            for(CorridaIterator iterator = listadoCorridas.iterator();iterator.hasNext();){
                Corrida corrida = iterator.next();
                System.out.println(corrida);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
