package bd;

import coleccion.ListadoCorridas;
import modelo.Corrida;

import java.sql.*;
import java.util.ArrayList;

public class CorridaBD extends BDConexion{

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/pplus";
    private static final String USER = "root";
    private static final String PASS = "pass";

    private static CorridaBD instancia;
    private CorridaBD(){};
    public static CorridaBD getInstance(){
        if(instancia== null)
            instancia = new CorridaBD();
        return instancia;
    }

    public ListadoCorridas obtenerCorridas()
    throws ClassNotFoundException,SQLException{
        abrirConexion(DB_URL);
        String consulta = "SELECT * FROM corridas";
        ResultSet response = getStatement().executeQuery(consulta);
        ArrayList<Corrida> lista = new ArrayList<Corrida>();

        while (response.next()){
            Corrida corrida = new Corrida();
            corrida.setId(response.getInt("id"));
            corrida.setOrigen(response.getString("origen"));
            corrida.setDestino(response.getString("destino"));
            corrida.setFechaSalida(response.getString("fechaSalida"));
            corrida.setHoraSalida(response.getString("horaSalida"));
            corrida.setFechaLlegada(response.getString("fechaLlegada"));
            corrida.setHoraLlegada(response.getString("horaLlegada"));
            corrida.setEscalas(response.getInt("escalas"));
        }
        ListadoCorridas listadoCorridas = new ListadoCorridas();
        listadoCorridas.setLista(lista);
        listadoCorridas.setNombre("Todas las corridas");

        response.close();
        cerrarConexion();
        return listadoCorridas;
    }

    public Corrida buscarCorrida(int id)
            throws ClassNotFoundException, SQLException {
        abrirConexion(DB_URL);
        String consulta = String.format("SELECT * FROM corridas WHERE id = %d",id);
        ResultSet response = getStatement().executeQuery(consulta);
        Corrida corrida = new Corrida();

        /* Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = String.format("SELECT * FROM corridas WHERE id = %d",id);
        ResultSet response = st.executeQuery(consulta);
        Corrida corrida = new Corrida();*/

        if (response.next()){
            corrida.setId(response.getInt("id"));
            corrida.setOrigen(response.getString("origen"));
            corrida.setDestino(response.getString("destino"));
            corrida.setFechaSalida(response.getString("fechaSalida"));
            corrida.setHoraSalida(response.getString("horaSalida"));
            corrida.setFechaLlegada(response.getString("fechaLlegada"));
            corrida.setHoraLlegada(response.getString("horaLlegada"));
            corrida.setEscalas(response.getInt("escalas"));
        }
        /*System.gc();
        response.close();
        st.close();
        conexion.close();*/

        response.close();
        cerrarConexion();

        return corrida;

}

    public static boolean insertarCorrida(Corrida corrida)
            throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement st = conexion.createStatement();
        String consulta = String.format("INSERT INTO corridas(origen,destino,fechaSalida,horaSalida," +
                        "fechaLlegada,horaLlegada,escalas) VALUES ('%s','%s','%s','%s','%s','%s','%d')",
                corrida.getOrigen(),
                corrida.getDestino(),
                corrida.getFechaSalida(),
                corrida.getHoraSalida(),
                corrida.getFechaLlegada(),
                corrida.getHoraLlegada(),
                corrida.getEscalas());
        int respuesta = st.executeUpdate(consulta);
        st.close();
        conexion.close();

        return respuesta == 1;

    }
}
