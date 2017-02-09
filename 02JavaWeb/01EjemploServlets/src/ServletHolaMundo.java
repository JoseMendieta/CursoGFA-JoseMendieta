import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/hola"})
public class ServletHolaMundo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Persona p = new Persona("Juan","Perez",20);

        PrintWriter pw = response.getWriter();
        //pw.print("<h1>Hola Mundo</h1>");
        pw.print(p);
        pw.flush();


    }
}
