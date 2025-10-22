package Tema2;
import java.util.Scanner;

public class EjercicioRecopilatorio {
    public static void main(String[] args) {
        
        menu();

    }

    static void menu() {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean salida = false;

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
            opcion = scanner.nextInt();
            
            switch (opcion) {

                case 1:
                    DibujaRectangulo.main(null);
                    break;
                case 2:
                    RectanguloRelleno.main(null);
                    break;
                case 3:
                    DibujaTriangulo.main(null);
                    break;
                case 4:
                    TrianguloRelleno.main(null);
                    break;
                case 5:
                    System.out.println("Saliendo del Programa !!!1");
                    salida = true;
                    break;

                default:
                    System.out.println("Opcion no valida !!!!");

            }

        } while (!salida);

        scanner.close();
    }
}
