/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11ejerciciolamda;

import java.util.ArrayList;
import java.util.Arrays;

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
        Ordenamiento ObtienePares = (ArrayList<Integer> arr) -> {

            ArrayList<Integer> pares = new ArrayList<Integer>();

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) % 2 == 0) {
                    pares.add(arr.get(i));
                }
            }

            return pares;

        };
        
        
        Ordenamiento ObtieneImpar =(ArrayList<Integer> arr) -> {

            ArrayList<Integer> impar = new ArrayList<Integer>();

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) % 2 != 0) {
                    impar.add(arr.get(i));
                }
            }

            return impar;

        };
        
         ArrayList<Integer> numeros = new ArrayList<Integer>();
         numeros.add(2);
         numeros.add(5);
         numeros.add(7);
         numeros.add(1);
         numeros.add(3);
         numeros.add(2);
         
        System.out.println("Pares: " +Ordena(numeros,ObtienePares));
        System.out.println("Impares: " +Ordena(numeros,ObtieneImpar));
        

    }
    
    
    public static ArrayList<Integer> Ordena(ArrayList<Integer> ar, Ordenamiento Ordenar){
        return  Ordenar.Ordenar(ar);
    }

}
