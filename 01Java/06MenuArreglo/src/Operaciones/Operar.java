package Operaciones;

public class Operar {


    public int suma(int[] entero) {
        int rSuma = 0;
        for (int i = 0; i < entero.length; i++) {
            rSuma += entero[i];
        }
        return rSuma;
    }

    public float media(int[] entero) {
        int rSuma = suma(entero);
        float rMedia = rSuma / entero.length;
        return rMedia;
    }

    public int mayor(int[] entero) {
        int rMayor = 0;
        for (int i = 0; i < entero.length; i++) {
            if (entero[i] > rMayor) {
                rMayor = entero[i];
            }
        }
        return rMayor;
    }
}
