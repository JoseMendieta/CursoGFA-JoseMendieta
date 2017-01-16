public class Main {

    public static void main (String []args) {
        Matematicas suma = (float a, float b) -> a + b;
        Matematicas resta = (float a, float b) -> a - b;
        Matematicas multiplicacion = (float a, float b) -> a * b;
        Matematicas division = (float a, float b) -> a / b;

        System.out.println("Suma " + operar(10f,20f, suma));
        System.out.println("Resta " + operar(10f,20f, resta));
        System.out.println("Multiplicacion " + operar(10f,20f, multiplicacion));
        System.out.println("Division " + operar(10f,20f, division));
    }


        static float operar(float a, float b, Matematicas operacion){
            return operacion.operacion(a,b);
    }
}
