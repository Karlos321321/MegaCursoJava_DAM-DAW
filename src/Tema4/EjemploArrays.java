package Tema4;

import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
        
        int[] array = {3,4,5,6,6};

        //Se imprime con un bucle For
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();

        //Se imprime con un bucle for each
        for (int i : array) {
            System.out.print(i);
        }

        //Se puede imprimir con Arrays.toStrings sin bucles

    System.out.println("\n" + Arrays.toString(array));


    }
}
