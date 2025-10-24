package Tema4;

public class Ejercicio1_Tema4 {
    public static void main(String[] args) {
        
        int[] array = {3,5,5,7,1,6,6,6,13,13,13,13};
        int numero = 13;
        mostarEnPantalla(numero , repetido(numero, array));
    }

    static void mostarEnPantalla(int n , int veces){

         if (veces==0) System.out.println("El numero " + n + " no existe...");
            else if (veces>0 && veces<=1) System.out.println("El numero aparece 1 sola vez");
                else if(veces>1) System.out.println("El numero " + n + " aparece " + veces + " veces");
    }

    static int repetido (int n , int[]array){

        int contador = 0;
        for (int i = 0; i < array.length; i++) {    
            if (array[i] == n) contador++;
        }
        return contador;
    }
}
