package Tema4;

public class EjemploArrays {
    public static void main(String[] args) {
        
        int[] array = {3,4,5,6,6};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println();


        for (int i : array) {
            System.out.print(i);
        }
    }
}
