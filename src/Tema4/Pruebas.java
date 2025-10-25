package Tema4;

public class Pruebas {
    public static void main(String[] args) {
        
        int[][] array1 = {
            {1,2,5},
            {6,7,8},
            {10,0,4}       
        };

        int[][] array2 = {
            {5,1,4},
            {7,3,11},
            {11,12,13}
        };

        int total1 = comprobarMatrices(array1);
        int total2 = comprobarMatrices(array2);

        if(total1>total2) System.out.println("EL array1 es mayor que el array2, no se pueden comparar");
        else if (total2>total1) System.out.println("EL array2 es mayor que el array1, no se pueden comparar");
        else imprime();
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
}
