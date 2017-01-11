import matematicas.Matematicas;
import java.util.Scanner;

public class Main {
    public static void main (String []args){

        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a;
        float b;

        System.out.println("Introduce un Número");
        a = lector.nextFloat();
        System.out.println("Introduce otro Número");
        b = lector.nextFloat();

        //Metodo STATIC
        System.out.println("Resultado: " + Matematicas.suma(a,b));

        //Sin Metodo STATIC
        System.out.println("Resultado: " + mat.resta(a,b));
        System.out.println("Resultado: " + mat.multiplicacion(a,b));
        System.out.println("Resultado: " + mat.division(a,b));

    }
}
