package Tema4;

public class MaximoMinimoMatrices {
    public static void main(String[] args) {

        int[][] array1 = {
            {1,2,5},
            {6,7,8},
            {10,0,4}       
        };

        int[][] array2 = {
            {5,1,4},
            {7,3,11},
            {11,12,13,14}
        };

        int total1 = comprobarMatrices(array1);
        int total2 = comprobarMatrices(array2);

        if(total1>total2) System.out.println("EL array1 es mayor que el array2, no se pueden comparar");
        else if (total2>total1) System.out.println("EL array2 es mayor que el array1, no se pueden comparar");
        else maximoValor(array1, array2);
    }

    static int comprobarMatrices(int n[][]){

        int tamañoTotal=0;
        if(n==null) return 0;
        for (int i = 0; i < n.length; i++) {
            if(n[i]==null) return 0;
            else tamañoTotal += n[i].length;
        }
        return tamañoTotal;    
    }

        
    /*static void mostrarArrayResultante(int[] array){
        for (int j = 0; j < array.length; j++) {
            System.out.println("Valor Maximo " + array[j] + " --> posicion " + j);
        }   
    }*/

    static void maximoValor(int[][] n , int[][] n2){
        
        int[][] arrayResultante = new int[n.length][n2.length];   
        
        for (int i = 0; i < arrayResultante.length; i++) {
                
            for (int j = 0; j < arrayResultante.length; j++) {
                
                int valor1 = (i<n.length) ? n[i][j] : 0;
                int valor2 = (i<n2.length) ? n2[i][j] : 0;
                arrayResultante[i][j] = Math.max(valor1, valor2);
            }
        }

        for (int[] fila : arrayResultante) {
            for (int columna : fila) {

                System.out.println(columna + " "); 
            }
        }
    }
}

