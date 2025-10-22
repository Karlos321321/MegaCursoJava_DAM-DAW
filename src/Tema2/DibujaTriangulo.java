package Tema2;

public class DibujaTriangulo {
    public static void main(String[] args) {
        
        int altura = 10;
        
        for (int i = 2; i < altura; i++) {  
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == altura - 1) {
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
