package Tema3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción del menú:");
        int opcion = scanner.nextInt();
        
        menu(opcion);

        if (opcion == 1) {
            System.out.println("¡Hola! Bienvenido al programa.");
        } else if (opcion == 2) {
            int numero = 3;
            System.out.println("El cubo de " + numero + " es: " + NumeroalCubo_2.calcularCubo(numero));
        } else if (opcion == 3) {
            int num1 = 4;
            int num2 = 5;
            System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + Multiplicacion_3.multiplicar(num1, num2));
        } else if (opcion == 4) {
            TablaMultiplicar.main(null);
        } else if (opcion == 5) {
            System.out.println("Saliendo del programa. ¡Hasta luego!");
        } else {
            System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
        }
        scanner.close();    
    }

    static void menu(int opcion) {

        System.out.println("Bienvenido al menú de opciones.");
        System.out.println("1. Saludo");
        System.out.println("2. Número al cubo");
        System.out.println("3. Multiplicación");
        System.out.println("4. Tabla de multiplicar\n");
        System.out.println("5. Salir");
    }
}
