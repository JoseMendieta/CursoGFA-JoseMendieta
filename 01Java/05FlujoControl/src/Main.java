import java.util.Scanner;
public class Main {

    public static void main(String []args){
        String[] Nombres = new String[5];
        Scanner lector = new Scanner(System.in);

        for (int i=0; i<Nombres.length ; i++){
            System.out.println("Escribe el nombre " + (i+1));
            Nombres [i] = lector.nextLine();
        }

        for (i=0; i<Nombres.length  ; i++){
            System.out.println("Nombre " + (i+1) +" "+ Nombres[i]);
        }
    }
}
