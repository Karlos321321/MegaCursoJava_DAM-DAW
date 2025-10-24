package Tema4;
import java.util.Arrays;
import java.util.Random;

public class EjemploArrays2 {
    public static void main(String[] args) {
        mostrarArraycaso2(crearArray(10 , 100));
    }

    //Mostrar array resultante ordenado
    static void mostrarArraycaso2(int[] n){
        Arrays.sort(n);
        System.out.println();

        for (int i : n){
            System.out.print("[" + i + "],");
        }
        System.out.print("\b ");
        System.out.println("\n");
    }

    //Crea un Array de numeros Aleatorios sin repeticion 
    static int[] crearArray(int elementos , int max){

        int[] array = new int[elementos];
        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = r.nextInt(max);

             if (repetido(numeroAleatorio, array)) i--;
             else array[i] = numeroAleatorio; 
        }
        return array;
    }

    //Comprueba si el numero esta repetido en el array
    static boolean repetido (int n , int[] i){

        for (int j = 0; j < i.length; j++){
            if (i[j] == n) return true;
        }
        return false; 
    }
}
