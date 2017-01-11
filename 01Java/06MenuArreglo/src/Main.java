import Operaciones.Operar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operar opera = new Operar();
        Scanner lector = new Scanner(System.in);

        System.out.println("Capture el tamaño del arreglo: ");
        int x = lector.nextInt();
        System.out.println("Elija la Operacion a Realizar");
        System.out.println("1) Suma del Arreglo ");
        System.out.println("2) Calcular Media ");
        System.out.println("3) Numero Mayor ");
        System.out.println("4) Salir ");
        int opcion = lector.nextInt();

        int[] entero = new int[x];

        for (int i=0; i < entero.length; i++) {
            System.out.println("Capture el valor " + (i+1));
            entero [i] = lector.nextInt();
        }


        switch (opcion) {
            case 1:
                System.out.println("Suma: " + opera.suma(entero));
                break;
            case 2:
                System.out.println("Media: " + opera.media(entero));
                break;
            case 3:
                System.out.println("Mayor: " + opera.mayor(entero));
        }
    }
}