package Tema4;

public class MaximoMinimoMatrices {
    public static void main(String[] args) {

        int[][] array1 = {
            {1,2,21},
            {6,7},
            {10,8,15}       
        };

        int[][] array2 = {
            {5,1,23},
            {7,3,11},
            {11,12,13}
        };

        int total1 = comprobarMatrices(array1);
        int total2 = comprobarMatrices(array2);

        /*if(total1>total2) System.out.println("EL array1 es mayor que el array2, no se pueden comparar");
        else if (total2>total1) System.out.println("EL array2 es mayor que el array1, no se pueden comparar");
        else maximoValor(array1, array2);*/

        maximoValor(array1, array2);
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
            for (int j = 0; j < arrayResultante[i].length; j++) {

                if (n==null || n2==null) arrayResultante[i][j] = 0;
                    else if (n[i][j] > n2[i][j]) arrayResultante[i][j] = n[i][j];
                        else arrayResultante[i][j] = n2[i][j];
            }
        }

        for (int[] fila : arrayResultante) {
            for (int columna : fila) {
                System.out.print("[" + columna + "] "); 
            }
            System.out.println();
        }
    }
}

