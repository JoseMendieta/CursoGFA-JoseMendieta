package db;

import model.Autobus;
import model.Vehiculo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String USER = "root";
    private static final String PASS = "pass";

    public boolean registrarVehiculo(Vehiculo vehiculo) throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();
        String query = String.format("INSERT INTO vehiculo (id,tipo,marca,modelo,ruedas) values ('%d','%s','%s','%d','%d')",
                vehiculo.getId(),vehiculo.getTipo(),vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getRuedas());
        boolean res = consulta.execute(query);
        consulta.close();
        conexion.close();

        return res;

    }

    public List<Vehiculo> getVehiculo() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM vehiculo");

        ArrayList<Vehiculo> lista = new ArrayList<>();
        //Autobus autobus = new Autobus();

        while (resultado.next()) {

            Vehiculo vehiculo = new Vehiculo();

            vehiculo.setId(resultado.getInt("id"));
            vehiculo.setSiglas(resultado.getString("siglas"));
            vehiculo.setModelo(resultado.getInt("modelo"));
            vehiculo.setCapacidad(resultado.getInt("capacidad"));
            vehiculo.setBase(resultado.getString("base"));

            lista.add(autobus);
        }

        resultado.close();
        consulta.close();
        conexion.close();

        return lista;

    }

}
