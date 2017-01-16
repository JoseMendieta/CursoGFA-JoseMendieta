import deportes.Boxeador;
import deportes.Deporte;
import deportes.Futbolista;
import oficina.Desarrollador;
import oficina.Operador;
import persona.Persona;

public class Main {

    public static void pruebaInterfaz(Deporte d){
        d.entrenar();
    }

    public static void pruebaHerencia(Persona p){
        p.hablar();
    }

    public static void main(String[] args) {

        Futbolista f = new Futbolista("Jose", "Mendieta", 21,"delantero",43);
        Boxeador b = new Boxeador("Luis","Martinez",30,"Pluma");

        pruebaInterfaz(f);
        pruebaInterfaz(b);

        /*
        Desarrollador d = new Desarrollador("Jose", "Lopez", 34, 997655, 2.0f);

        Operador o = new Operador("Jose", "Lopez", 34, 997655, 2.0f);

        d.trabajar();
        d.transporteTorta();
        o.trabajar();
        o.transporteTorta();

        /*
        Persona p = new Persona("Jose Mendieta");
        p.hablar();
        System.out.println(p);
        Futbolista f = new Futbolista("Juan", "Perez", 33, "Delantero", 3);
        f.hablar();
        System.out.println(f);

        /*p.setEdad(83);
        Persona p2 = new Persona( "Jose",  "Mendieta",  30);

        System.out.println("Nombre: " + p.getNombre() + "; Apellido: " + p.getApellido() + " Edad: " + p.getEdad());

        System.out.println("Nombre: " + p2.getNombre() + "; Apellido: " + p2.getApellido() + " Edad: " + p2.getEdad());
        */

    }

}
