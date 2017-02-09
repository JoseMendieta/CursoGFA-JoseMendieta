package ws;

import model.Estado;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.sql.SQLException;


@WebService
public interface EstadosWS {

    @WebMethod
    public  String getCapital(String s) throws ClassNotFoundException,
            SQLException;

    @WebMethod
    public  int getPoblacion(String s) throws ClassNotFoundException,
            SQLException ;

    @WebMethod
    public Estado[] getEstados() throws ClassNotFoundException,
            SQLException;

}
