package deportes;

import persona.Persona;

/**
 * Created by ERP06 on 12/01/2017.
 * Extends - Herencia
 * implements - Interface
 */
public class Boxeador extends Persona implements Deporte{

    String peso;

    public Boxeador(String nombre, String apellido, int edad, String pluma) {
        super(nombre, apellido, edad);
        this.peso= peso;
    }

    @Override
    public void entrenar(){
        System.out.println("Al gym a las 5am");
    }

    @Override
    public void viajar(){
        System.out.println("Viaja para la pelea");
    }

    @Override
    public void jugar(){
        System.out.println("Golpe");
    }
}
