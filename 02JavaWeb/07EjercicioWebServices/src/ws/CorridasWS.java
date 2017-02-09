package ws;

import model.Corrida;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;


@WebService
public interface CorridasWS {

    @WebMethod
    public  String getCapital(String s) throws ClassNotFoundException,
            SQLException;

    @WebMethod
    public  int getPoblacion(String s) throws ClassNotFoundException,
            SQLException ;

    @WebMethod
    public Corrida[] getEstados() throws ClassNotFoundException,
            SQLException;

}
