public class MiSingleton {

    private String nombre;
    static private MiSingleton miSingleton;

    public static MiSingleton getInstance(String nombre){
        if(miSingleton==null) {
            miSingleton = new MiSingleton(nombre);
        }else {
            System.out.println("No se puede generar la instancia " + nombre);
            System.out.println("Ya existe la instancia " + miSingleton.nombre);
        }

        return miSingleton;
    }

    public int suma(int a, int b){
        return a+b;
    }

    public MiSingleton(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
