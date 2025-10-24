package Tema4;
import java.util.Random;

public class EjemploArrays2 {
    public static void main(String[] args) {
        
        //caso1
        int[] array = {1,2,3,5,15,24,8,6};
        mostarArray(array);

        //caso2
        System.out.println();
        mostrarArraycaso2(crearArray(5));
    }

    static void mostrarArraycaso2(int[] n){

        for (int i : n){
            System.out.print(i + ",");
        }
    }

    //Caso 1 -- Mostrar resultados
    static void mostarArray(int[] n){
         for (int i : n) {
            System.out.print(i + ",");
        }
    }

    static int[] crearArray(int elementos){

        int[] array = new int[elementos];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }
    
        return array;
    }
}
