package oficina;

public class Operador extends Empleado {
    public Operador(String nombre, String apellido, int edad, int cveEmpleado, float salario) {
        super(nombre, apellido, edad, cveEmpleado, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Conduce las unidades, Hace liquidacion");
    }

    @Override
    public void transporteTorta() {
        System.out.println("Trafica con tortas en sobres Azules");
    }
}
