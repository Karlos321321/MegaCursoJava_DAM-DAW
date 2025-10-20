package Tema2;
import java.util.Scanner;

public class DibujaTrianguloEquilatero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Altura del Triangulo Equilatero --> ");
        int altura = scanner.nextInt(); // Altura fija del triángulo
        
        for (int i = 1; i < altura; i++) {  
            
            // Espacios antes de los asteriscos
            for (int j = altura - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Asteriscos y espacios internos
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == altura - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }

}
