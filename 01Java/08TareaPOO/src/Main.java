import moviles.Vehiculo;
import tipos.Moto;
import java.util.Scanner;

/**
 * Created by ERP06 on 12/01/2017.
 * Crear una clase vehículo de la cual hereden al menos otras cuatro clases
 * Implementar una clase abstracta o una interface que implemente al menos un método abstracto para cualquiera
 * de las clases derivadas.
 * Todas las clases deben estar encapsuladas
 * Estructurar el código en paquetes
 * Todos los vehículos deben contener un id
 * Cada clase debe contar con al menos dos atributos y dos metodos
 * <p>
 * 1. Desplegar un meni con las siguientes opciones
 * a) Registrar un nuevo vehículo
 * b) Eliminar vehículo por ID
 * c) BUscar por ID
 * d) Consultar Todo
 * e) Salir
 */
public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        int id = 0;
        int tipo = 0;
        int modelo = 0;
        int ruedas = 0;
        Vehiculo[] registro = new Vehiculo[10];
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        //Moto m = new Moto();

        while (opcion < 4) {
            String marca = "";
            System.out.println("Menú de Opciones");
            System.out.println("1: Registrar nuevo Vehiculo");
            System.out.println("2: Eliminar Vehiculo");
            System.out.println("3: Buscar Vehiculo");
            System.out.println("4: Consultar Todo");
            System.out.println("5: Salir");

            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Capture el ID: ");
                    id = scan.nextInt();
                    System.out.print("Capture el tipo (1) Moto, (2)Automovil, (3) Bicicleta : ");
                    tipo = scan.nextInt();
                    System.out.print("Capture la marca: ");
                    marca = scan2.nextLine();
                    System.out.print("Capture el modelo: ");
                    modelo = scan.nextInt();
                    System.out.print("Capture No. de Ruedas: ");
                    ruedas = scan.nextInt();
                    //registro[id] = tipo + " - " + marca + " - " + modelo + " - " + ruedas;
                    //registro [id] = Integer.toString(tipo)+marca+String.valueOf(modelo)+Integer.toString(ruedas);
                    System.out.println(registro[id]);
                    if (tipo == 1){
                        //m.presentar(registro[id]);
                        registro[id] = new Moto(id,tipo,marca,modelo,ruedas);
                    }

                    break;
                case 2:
                    System.out.print("Capture el ID el vehículo a eliminar: ");
                    id = scan.nextInt();

                    if (id >= 0 && id <= 10) {
                        registro[id] = null;
                        System.out.println("Registro Eliminado");
                    } else {
                        System.out.println("Registro No Existe");
                    }
                    break;

                case 3:
                    System.out.print("Capture el ID el vehículo a buscar: ");
                    id = scan.nextInt();

                    if (id >= 0 && id <= 9) {
                        System.out.println(registro[id]);
                    } else {
                        System.out.println("Registro No Existe");
                    }
                    break;
                case 4:
                    System.out.println("Catalogo de Vehículos ");

                    for (int i = 0; i < registro.length; i++) {
                        if (registro[i] != null) {
                            System.out.println(i + " " +registro[i]);
                        } else {
                            System.out.println(i + " Registro Vacio");
                        }
                    }

                //default:
                //    System.out.println("Saliendo del sistema...");
            }
        }
        System.out.println("Saliendo del sistema...");
    }
}
