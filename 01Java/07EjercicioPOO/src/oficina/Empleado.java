package oficina;

import persona.Persona;

public abstract class Empleado extends Persona{

    private int cveEmpleado;
    private float salario;

    public Empleado(String nombre, String apellido, int edad, int cveEmpleado, float salario){
        super(nombre, apellido, edad);
        this.cveEmpleado = cveEmpleado;
        this.salario = salario;
    }

    public abstract void trabajar();

    public abstract void transporteTorta();


}
