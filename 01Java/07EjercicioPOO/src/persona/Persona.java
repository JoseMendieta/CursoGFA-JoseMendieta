package persona;

/**
 * Created by ERP06 on 11/01/2017.
 */
public class Persona {

    private String nombre,apellido;
    private int edad;
    //protected String prueba = "Soy una variable";

    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombreCompleto){
        String[] nC = nombreCompleto.split(" ");
        this.nombre = nC[0];
        this.apellido = nC[1];
        this.edad = 0;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void hablar (){
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void comer(){
        System.out.println("Estoy comiendo...");
    }

}
