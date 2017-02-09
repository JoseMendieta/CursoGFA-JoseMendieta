package bd;

import model.Estado;

import java.sql.*;
import java.util.ArrayList;

public class EstadoBD {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/estadosMexico";
    private static final String USER = "root";
    private static final String PASS = "pass";


    static public Estado[] getEstados() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = "SELECT * from estados";
        ResultSet rs = st.executeQuery(consulta);
        ArrayList<Estado> lista = new ArrayList<Estado>();

        while (rs.next()) {
            lista.add(new Estado(
                    rs.getInt("idEstado"),
                    rs.getInt("municipios"),
                    rs.getInt("poblacion"),
                    rs.getString("nombre"),
                    rs.getString("comidaTipica"),
                    rs.getString("capital")
            ));
        }

        Estado[] es = new Estado[lista.size()];

        return lista.toArray(es);
    }

    public static String getCapital(String estadoNombre) throws ClassNotFoundException,
            SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String capital = null;

        String consulta = "SELECT capital from estados where nombre = '" + estadoNombre + "'";
        ResultSet rs = st.executeQuery(consulta);

        if (rs.next()) {
            capital = rs.getString("capital");
        }

        conexion.close();
        st.close();
        rs.close();

        return capital;

    }

    public static int getPoblacion(String estadoNombre) throws ClassNotFoundException,
            SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String capital = null;

        String consulta = "SELECT poblacion from estados where nombre = '" + estadoNombre + "'";
        ResultSet rs = st.executeQuery(consulta);

        int poblacion = 0;

        if (rs.next()) {
            poblacion = rs.getInt("poblacion");
        }

        conexion.close();
        st.close();
        rs.close();

        return poblacion;

    }
}
