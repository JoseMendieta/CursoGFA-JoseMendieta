import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<Operador> lista = Arrays.asList(
            new Operador("Juan", 324, true),
            new Operador("Jose", 221, false),
            new Operador("Karina", 321, true),
            new Operador("Maria", 432, true),
            new Operador("Luis", 839, false));

    public static void main(String[] args) {
        Long tiempoInicio = System.currentTimeMillis();
        filtroNuevo();
        Long tiempoFinal = System.currentTimeMillis();
        System.out.println(tiempoFinal-tiempoInicio);
        //filtroAntiguo();
    }


    public static void filtroNuevo() {
        List<Operador> operadores = lista.stream().filter(op -> op.isStatus()).collect(Collectors.toList());
        imprimir(operadores);
    }

    public static void filtroAntiguo() {
        List<Operador> operadores = new ArrayList<Operador>();
        for (Operador op : lista) {
            if (op.isStatus()) {
                operadores.add(op);
            }
        }
        imprimir(operadores);
    }

    public static void imprimir(List<Operador> operadores) {
        System.out.println("---- Lista Filtrada ----");
        for (Operador op : operadores) {
            System.out.println(op);
        }
    }

    public static void imprimirNuevo(List<Operador> operadores){
        System.out.println("---- Lista Filtrada 'Nuevo' ----");
        operadores.forEach(op-> System.out.println(op));
    }
}
