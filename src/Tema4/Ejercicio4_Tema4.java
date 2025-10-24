package Tema4;

public class Ejercicio4_Tema4 {
    public static void main(String[] args) {

        int[] array = {3,5,5,7,10,30,40};
        int[] array2 = {23,5,8};

        mostrarArrayResultante(maximoValor(array, array2));
        
    }

    static void mostrarArrayResultante(int[] array){
        for (int j = 0; j < array.length; j++) {

            System.out.println("Array con los maximos valores por posicion --> " + j);
        }   
    }

    static int[] maximoValor(int[] n , int[] n2){

        int[] arrayResultante = new int[Math.max(n.length, n2.length)];
        for (int i = 0; i < arrayResultante.length; i++) {

            int valor1 = (i<n.length) ? n[i] : 0;
            int valor2 = (i<n2.length) ? n2[i] : 0;
            arrayResultante[i] = Math.max(valor1, valor2);
        }
        return arrayResultante;
    }
}
