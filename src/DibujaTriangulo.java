import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt(); // Altura fija del triángulo

        for (int i = 1; i < altura; i++) {  
            
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
