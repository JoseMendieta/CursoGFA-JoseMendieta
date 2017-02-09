package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BDConexion {

static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
static final String USUARIO = "root";
static final String PASS = "pass";
private Connection conexion;
private Statement statement;

public void cerrarConexion() throws java.sql.SQLException{
    if(statement!=null)statement.close();
    if(conexion!=null)statement.close();
}

public void abrirConexion(String url)
    throws java.sql.SQLException,java.lang.ClassNotFoundException{
    Class.forName(JDBC_DRIVER);
    conexion = DriverManager.getConnection(url,USUARIO,PASS);
    statement = conexion.createStatement();
}

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
}
