public class FechaInvalida extends Exception {
    public FechaInvalida (){
        super ("La fecha es anterior a la actual");
        System.out.println("Excepcion de Fecha Lanzada");
    }

    public void otroMensaje(){
        System.out.println("Otros Mensajes");
    }
}
