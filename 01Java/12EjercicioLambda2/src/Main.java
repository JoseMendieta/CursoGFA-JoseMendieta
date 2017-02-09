/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11funcioneslanda;
import pkg11funcioneslanda.Matematicas;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Matematicas suma = (float num1, float num2)->num1+num2;
        Matematicas resta = (float num1, float num2)->num1-num2;
        Matematicas multiplicacion = (float num1, float num2)->num1*num2;
        Matematicas division = (float num1, float num2)->num1/num2;
        
        System.out.println("Suma: " +Operar(10f, 20f, suma));
        System.out.println("Resta: " +Operar(10f, 20f, resta));
        System.out.println("Multiplicacion: " +Operar(10f, 20f, multiplicacion));
        System.out.println("Division: " +Operar(10f, 20f, division));
    }
    
    public static float Operar(float a, float b,Matematicas operacion){
       return  operacion.Operaciones(a, b);
    }
    
}
