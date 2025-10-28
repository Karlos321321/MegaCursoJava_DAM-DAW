package Tema4;

public class Pruebas {
    public static void main(String[] args) {
        
        int[][] matriz1 = {
            {1}, 
            {7,10,11,23},
            {12,12,34,56},
            {10,21}
        };
           
        int[][] matriz2 = {
            {5,23}, 
            {10,12,13},
            {1}
        };
        
        //comprueba si la matriz1 es nula
        /*if(matriz1==null && matriz2!=null) {
            matriz1 = matriz2;
            impresionMatriz(crearMatrizMaxima(matriz1, matriz2));
          //comprueba si la matriz2 es nula
        } else if (matriz1!=null && matriz2==null) {
            matriz2 = matriz1;
            impresionMatriz(crearMatrizMaxima(matriz1, matriz2));
              //Si ambas matrices son nulas  
            } else if (matriz1==null && matriz2==null) System.out.println("Ambas matrices son nulas !!!!");
                //Si ninguna matriz es nula
                else impresionMatriz(crearMatrizMaxima(matriz1, matriz2));*/

        impresionMatriz(matrizMaxima(matriz1, matriz2));
    }

    static int[][] matrizMaxima(int n[][], int n2[][]){

        int[][] rellenoMaxima = crearMatrizMaxima(n, n2);

        for (int i = 0; i < rellenoMaxima.length; i++) {
            for (int j = 0; j < rellenoMaxima[i].length; j++) {
                //que la matriz 1 sea mayor que la 2 y que tenga la fila mas larga
                if(n.length>n2.length) {
                   
                    if(i<n2.length){ 

                        /*if(j<n2[i].length){
                                if (n[i][j] > n2[i][j]) rellenoMaxima[i][j] = n[i][j];
                                else rellenoMaxima[i][j] = n2[i][j];
                        } else rellenoMaxima[i][j] = n[i][j];*/

                        if(j<n[i].length){
                                if (n[i][j] > n2[i][j]) rellenoMaxima[i][j] = n[i][j];
                                else rellenoMaxima[i][j] = n2[i][j];
                                
                        } else rellenoMaxima[i][j] = n2[i][j];

                    } else rellenoMaxima[i] = n[i];
                }     
            }
        }
        return rellenoMaxima;    
    }

    static int[][] crearMatrizMaxima(int[][] n , int n2[][]){
        //Creando matriz maxima resultante

        int tamañofila = (n.length>n2.length) ? n.length : n2.length;
        int [][] maxima = new int [tamañofila][];
            // que la matriz1 sea mayor
            if (n.length>n2.length) {
                for (int i = 0; i < maxima.length; i++) {
                    if(i<n2.length){
                        if(n[i].length>n2[i].length) maxima[i] = new int[n[i].length];
                        else maxima[i] = new int[n2[i].length];
                    } else maxima[i] = new int[n[i].length];
                }
            // que la matriz2 sea mayor
            } else if (n.length<n2.length) { 
                 for (int i = 0; i < maxima.length; i++) {
                    if(i<n.length){
                        if(n[i].length>n2[i].length) maxima[i] = new int[n[i].length];
                        else maxima[i] = new int[n2[i].length];
                    } else maxima[i] = new int[n2[i].length];
                }
            //que las matrices sean iguales
            } else if (n.length == n2.length) { 
                 for (int i = 0; i < maxima.length; i++) {
                        if(n[i].length>n2[i].length) maxima[i] = new int[n[i].length];
                        else maxima[i] = new int[n2[i].length];
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

