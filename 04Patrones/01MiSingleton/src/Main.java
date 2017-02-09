/**
 * Created by ERP06 on 08/02/2017.
 */
public class Main {

    public static void main (String[] args){
        MiSingleton instancia1 = MiSingleton.getInstance("Instancia1");
        System.out.println("Nombre de la instancia: " + instancia1.getNombre());
        MiSingleton instancia2 = MiSingleton.getInstance("Instancia2");
        System.out.println("Nombre de la instancia: " + instancia2.getNombre());
    }
}
