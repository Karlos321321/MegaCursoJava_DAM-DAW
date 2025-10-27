package Tema4;

public class Pruebas {
    public static void main(String[] args) {
        
          int[][] matriz1 = {
            {1}, 
            {8,3,23},
            {8,12}};
            
        int[][] matriz2 = {
            {4,2}, 
            {6,10,11,21}, 
            {11,6,32},
            {12,1}};

        impresionMatriz(matrizMaxima(matriz1, matriz2));
    }
    
    static int[][] matrizMaxima(int[][] n , int n2[][]){

        int[][] maxima;

        if (n.length>n2.length) maxima = new int[n.length][];
        else maxima = new int[n2.length][];
        
        for (int i = 0; i < maxima.length; i++) {

            if(n[i].length>n2[i].length) maxima[i] = new int[n[i].length];
            else maxima[i] = new int[n2[i].length];
        }

        for (int i = 0; i < maxima.length; i++) {
            for (int j = 0; j < maxima[i].length; j++) {
                
                if (n[i][j]>n2[i][j]) maxima[i][j]=n[i][j];
                else maxima[i][j]=n2[i][j];
            }
        }

        return maxima;
    }

    static void impresionMatriz(int[][] n){

        for (int[] fila : n) {
            for (int columna : fila) {

                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}

