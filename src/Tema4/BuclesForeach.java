package Tema4;

import java.util.Arrays;

public class BuclesForeach {
    public static void main(String[] args) {
        
        //Recorrer un array unidimensional con for each
        int[] array = {1,2,3,4,5,5,6,7,8};
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        //otra forma de leer una array sin bucles
        int[] array2 = {1,2,4,5,5,9};
        System.out.println(Arrays.toString(array2));


        //Array bidimensional
        int[][] array3 = {
            {1,2,3,},
            {2,4,5,6,6},
            {6,7,8,9}
        };

        //lectura del array con bucle for
        for (int[] fila : array3) {
            for(int columna : fila){
                System.out.print(columna);
            }
            System.out.println();
        }

        //lectura del array con bucle for each
        for (int[] is : array3) {
            System.out.println(Arrays.toString(is));            
        }

        //lectura usando Arrays.DeepToString(nmbre del array)
        System.out.println(Arrays.deepToString(array3));
    }
}
