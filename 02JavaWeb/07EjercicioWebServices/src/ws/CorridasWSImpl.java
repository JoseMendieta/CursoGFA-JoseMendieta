package ws;

import bd.CorridaBD;
import model.Corrida;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.sql.SQLException;

@WebService
public class CorridasWSImpl implements CorridasWS {

    @Override
    @WebMethod
    public  String getCapital (@WebParam(name = "estado") String s) throws ClassNotFoundException,
            SQLException {
        return CorridaBD.getCapital(s);
    }

    @Override
    @WebMethod
    public  int getPoblacion(@WebParam(name = "estado") String s) throws ClassNotFoundException,
            SQLException {
        return CorridaBD.getPoblacion(s);
    }

    @Override
    @WebMethod
    @WebResult (name = "estado")
    public Corrida[] getEstados() throws ClassNotFoundException, SQLException {
        return CorridaBD.getEstados();
    }
}
