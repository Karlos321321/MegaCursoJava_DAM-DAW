package Tema4;

public class MatricesBidimensionales {
    public static void main(String[] args) {
        
        //Declaracion e inicializacion de las matrices bidimensionales
        int[][] numeros = new int[3][5];//Filas y columnas

        int[][] enteros = { //otra forma de representar la matriz bidimensional
                {3,4,3,4,5},
                {4,2,3},
                {},
                {12,32,34,4}        
                };


        // Forma de recorrer las matrices 
        
        for (int i = 0; i < enteros.length; i++) {//Recorrido de las files o matrices unidimensionales
            for (int j = 0; j < enteros[i].length; j++) {//Recorrido de las columnas de las filas

                 if (j!=0) System.out.print(" - ");
                System.out.print("[" + enteros[i][j] + "]");
                 
            }

            System.out.println();  
        }
    }
}

