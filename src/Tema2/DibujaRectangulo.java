package Tema2;

public class DibujaRectangulo {
    public static void main(String[] args) {

        int base = 10;
        int alto = 5;

        for (int i = 0; i < alto; i++) {  
            for (int j = 0; j < base; j++) {
                if (i==0) {
                    System.out.print("*"); 
               } else if (i == alto - 1) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else if (j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
