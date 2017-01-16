import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*String s = "Jose";
        ArrayList<String> a = null;
        try {
            a.add("d");
            System.out.println("Try");
            int d = Integer.parseInt(s);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Posicion no valida");
        }
        catch (NumberFormatException ex){
            System.out.println("Error de Formato");
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Exception Generica");
        }

        System.out.println("Hola Excepciones");*/

        Boleto b = new Boleto();
        Date d = new Date("05/25/1990");

        try{
            b.setFecha(d);
        } catch (FechaInvalida e){

            System.out.println("Fecha invalida");
            e.printStackTrace();
            e.otroMensaje();
        }finally {
            System.out.println(b.getFecha());
            System.out.println("Siempre se va a ejecutar");
        }
    }
}
