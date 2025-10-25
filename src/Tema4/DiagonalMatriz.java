package Tema4;

public class DiagonalMatriz {
    public static void main(String[] args) {

        int n=10;
        imprimirMatrizDiagonal(crearMatriz(n));
        System.out.println();
        imprimirMatrizDiagonal(crearMatrizInvertida(n));

    }

    static void imprimirMatrizDiagonal(int[][] matriz){

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                char valor = (char) (matriz[i][j]);
                System.out.print(valor + " ");
                    
            }
            System.out.println();
        }
    }

    static int[][] crearMatrizInvertida(int n){

        int[][] diagonal2 = new int[n][n];
        char caraterDiagonal = 88;
        char guion = 45;

        for (int i = 0; i < diagonal2.length; i++) {
            for (int j = 0; j < diagonal2[i].length; j++) {

                if(j==diagonal2[i].length-(i+1)) diagonal2[i][j]= 88;
                else diagonal2[i][j]=45;
            }
        }

        return diagonal2;
    }

    static int[][] crearMatriz(int n){

        int[][] diagonal = new int[n][n];
        char caraterDiagonal = 88;
        char guion = 45;

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {

                if(i==j) diagonal[i][j]= 88;
                else diagonal[i][j]=45;
    
            }
        }

        return diagonal;
    }
}
