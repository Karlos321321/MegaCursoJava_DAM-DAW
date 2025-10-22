package Tema2;
import java.util.Scanner;

public class EjercicioRecopilatorio {
    public static void main(String[] args) {
        
        menu();

    }

    static void menu() {

        boolean salida = false;
        Scanner scanner = new Scanner(System.in);

        do {

        System.out.println("\n================================\n");
        System.out.println("Bienvenido al menú de opciones.\n");
        System.out.println("1. Dibuja cuadrado");
        System.out.println("2. Dibuja cuadrado sin relleno");
        System.out.println("3. Dibuja Triangulo");
        System.out.println("4. Dibuja Triangulo sin relleno");
        System.out.println("5. Salir");
        System.out.println("\n==============================");
            
        System.out.println("Seleccione una opción del menú:");
        int opcion = scanner.nextInt();
        
           if (opcion == 1) {
                RectanguloRelleno.main(null);
            } else if (opcion == 2) {
                DibujaRectangulo.main(null);
            } else if (opcion == 3) {
                TrianguloRelleno.main(null);
            } else if (opcion == 4) {
                DibujaTriangulo.main(null);
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                salida = true;
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 5.");
            }   

        } while (!salida);

        scanner.close();
    }
}
