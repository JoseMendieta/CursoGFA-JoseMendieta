package pruebas;

import bd.BDConexion;
import bd.CorridaBD;
import modelo.Corrida;

import java.sql.SQLException;

public class Main {

    public static void main (String[] args){
        BDConexion bdConexion = CorridaBD.getInstance();
        try{
            Corrida corrida = CorridaBD.buscarCorrida(8);
            System.out.println(corrida);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
