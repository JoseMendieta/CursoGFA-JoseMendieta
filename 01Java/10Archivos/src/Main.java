import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        Scanner s2= new Scanner(System.in);
        /*
        System.out.println("Ingresa el Codigo de Error");
        int cError = s.nextInt();
        System.out.println("Ingresa la descripcion del Error");
        String description = s2.nextLine();

        Error e1 = new Error(cError, description);
        e1.escribir("out/production/10Archivos/errores.txt");
        */

        Escribible e = new Error();
        e.leer("out/production/10Archivos/errores.txt",1484411342796L);
        System.out.println(e);
    }

}
