package Tema4;

public class MatricesIrregulares {
    public static void main(String[] args) {
        
        int[][] matriz1 = {
            {23}, 
            {10,12,13,34},
            {15,40,46},
            {26,35}
        };
           
        int[][] matriz2 = {
            {28}, 
            {100,12,13,340},
            {15,40,46},
            {27,34},
            {23,23},
            {1}
        };
        
        //comprueba si la matriz1 es nula
        if(matriz1==null && matriz2!=null) {
            matriz1 = matriz2;
            impresionMatriz(matrizMaxima(matriz1, matriz2));
          //comprueba si la matriz2 es nula
        } else if (matriz1!=null && matriz2==null) {
            matriz2 = matriz1;
            impresionMatriz(matrizMaxima(matriz1, matriz2));
              //Si ambas matrices son nulas  
        } else if (matriz1==null && matriz2==null) System.out.println("Ambas matrices son nulas !!!!");
                //Si ninguna matriz es nula
            else impresionMatriz(matrizMaxima(matriz1, matriz2));
    }

    static int[][] matrizMaxima(int n[][], int n2[][]){

        int[][] rellenoMaxima = crearMatrizMaxima(n, n2);

        for (int i = 0; i < rellenoMaxima.length; i++) {
            for (int j = 0; j < rellenoMaxima[i].length; j++) {
                //que la matriz 1 sea mayor que la matriz 2
                if(n.length>n2.length) {
                   
                    if(i<n2.length){ 
                        //que la fila de la matriz1 sea mas larga que la de la matriz 2
                        if(n[i].length<n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n2[i][j];
                        }
                        //que la fila de la matriz2 sea mas larga que la de la matriz 1
                        if(n[i].length>n2[i].length){
                            if(j<n2[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }
                        //que la fila de la matriz2 sea igual que la de la matriz 1
                         if(n[i].length==n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }

                    } else rellenoMaxima[i] = n[i];
                //que la matriz 2 sea mayor que la matriz 1
                } else if(n.length<n2.length) {
                   
                    if(i<n.length){ 
                        //que la fila de la matriz1 sea mas larga que la de la matriz 2
                        if(n[i].length<n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n2[i][j];
                        }
                        //que la fila de la matriz2 sea mas larga que la de la matriz 1
                        if(n[i].length>n2[i].length){
                            if(j<n2[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }
                        //que la fila de la matriz2 sea igual que la de la matriz 1
                         if(n[i].length==n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }

                    } else rellenoMaxima[i] = n2[i];
                //ambas matrices son iguales
                } else if(i<n.length){
                        //que la fila de la matriz1 sea mas larga que la de la matriz 2
                        if(n[i].length<n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n2[i][j];
                        }
                        //que la fila de la matriz2 sea mas larga que la de la matriz 1
                        if(n[i].length>n2[i].length){
                            if(j<n2[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }
                        //que la fila de la matriz2 sea igual que la de la matriz 1
                         if(n[i].length==n2[i].length){
                            if(j<n[i].length) rellenoMaxima[i][j] = (n[i][j]>n2[i][j] ? n[i][j] : n2[i][j]);
                            else rellenoMaxima[i][j] = n[i][j];
                        }

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

