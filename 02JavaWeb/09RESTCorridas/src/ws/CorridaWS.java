package ws;

import bd.CorridaBD;
import model.Corrida;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;

@Path("/")
public class CorridaWS {

    @Path("Consulta/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida consulta(@PathParam("id")int id){
        try {
            return CorridaBD.buscarCorrida(id);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida insertar(@QueryParam("origen")String origen,
                           @QueryParam("destino")String destino,
                           @QueryParam("fechaSalida")String fechaSalida,
                           @QueryParam("horaSalida")String horaSalida,
                           @QueryParam("fechaLlegada")String fechaLlegada,
                           @QueryParam("horaLlegada")String horaLlegada,
                           @QueryParam("escalas")int escalas){

        Corrida corrida = new Corrida(0,
                escalas,
                origen,
                destino,
               fechaSalida,
                fechaLlegada,
                horaSalida,
                horaLlegada);

        try {
            CorridaBD.insertarCorrida(corrida);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return corrida;

    }
}
