public class Main {

    public static void main (String []args){
        int[] Entero = new int[10];
        int[] EnteroB = {1,2,3,4,5}; //Arreglo Inicializado
        String[] Cadena = new String[10];
        boolean[] B = new boolean[10];

        System.out.println(Entero[0]);
        System.out.println(Cadena[0]);
        System.out.println(B[0]);

        Entero[0] = 10;
        System.out.println(Entero[0]);

        //Arreglos Bidimensionales
        int [][] EnteroBidimensional = new int[2][3];
        int [][] EnteroBidimensionalB = {{1,3,4},{3,5,2}};

        System.out.println(EnteroBidimensionalB[1][0]);
    }
}
