package Tema4;

public class MatrizMaxima {
    public static void main(String[] args) {
        
        int[][] matriz1 = {
            {12},
            {28,23,23},
            {8,12}};
            
        int[][] matriz2 = {
            {4}, 
            {6,10,11}, 
            {11,32}};

        if (matricesIguales(matriz1, matriz2)) impresionMatriz(matrizMaxima(matriz1, matriz2));
            else System.out.println("Las matrices no son iguales y no se pueden comparar !!!!"); 
    }
    
    static boolean matricesIguales(int[][]n , int[][]n2){
        if (n.length == n2.length){
            for (int i = 0; i < n.length; i++) {
                if(n[i].length != n2[i].length) return false;                
            }
            return true;     
        }
        return false;
    }

    static int[][] matrizMaxima(int[][] n , int n2[][]){

        int[][] maxima = new int [n.length][];

        for (int i = 0; i < n.length; i++) {
            maxima[i] = new int[n[i].length];
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
