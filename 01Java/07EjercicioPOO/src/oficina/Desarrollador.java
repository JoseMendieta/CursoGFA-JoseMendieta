package oficina;

public class Desarrollador extends Empleado {
    public Desarrollador(String nombre, String apellido, int edad, int cveEmpleado, float salario) {
        super(nombre, apellido, edad, cveEmpleado,salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Codifica, Desarrolla, etc...");

    }

    @Override
    public void transporteTorta() {
        System.out.println("Trafica con tortas con sobres amarillos");
    }
}
