import java.util.Scanner;

public class DibujaRectangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        int alto = scanner2.nextInt();

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
        
        scanner.close();
        scanner2.close();
    }
}
