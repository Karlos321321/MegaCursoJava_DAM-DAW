package Tema4;

public class ArrayBidimensionalIrregular {
    public static void main(String[] args) {
        
        //Se pueden inicilizar las filas mas tarde
        int[][] b = new int[10][];
        int contador = 0;

        /*b[0] = new int[3];
        b[1] = new int[4];
        b[3] = new int[6];*/

        //b[2] es null.

        for (int i = 0; i < b.length; i++) {
            b[i] = new int[i+1];

            for (int j = 0; b[i]!=null && j<b[i].length; j++) {
                
                b[i][j] = ++contador%10==0 ? ++contador%10 : contador%10;

                if (b[i][j]!=0) System.out.print(b[i][j] + " ");

            }

            System.out.println();
        }
    }
}
