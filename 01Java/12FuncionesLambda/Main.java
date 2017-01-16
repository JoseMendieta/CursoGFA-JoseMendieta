package pkg11funcioneslamda;

public class Main {

    public static void main(String[] args) {

        Matematicas suma = (float num1, float num2)->a+b;
        Matematicas resta = (float num1, float num2)->a-b;
        Matematicas multiplicacion = (float num1, float num2)->a*b;
        Matematicas division = (float num1, float num2)->a/b;
        
        System.out.println("pkg11funcioneslamda.Main.main()" +Operar(10f, 20f, suma));
        System.out.println("Resta" +Operar(10f, 20f, suma));
        System.out.println("Multiplicacion" +Operar(10f, 20f, suma));
        System.out.println("pkg11funcioneslamda.Main.main()" +Operar(10f, 20f, suma));
    }
    
    public static float Operar(float a, float b,Matematicas operacion){
       return  operacion.Operacion(a, b);
    }
}
