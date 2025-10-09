import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        
        System.out.println("\nMAYOR Y MENOR DE N NUMEROS");
        System.out.println("===========================\n");
        System.out.println("Cuantos numeros quieres introducir ?");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un numero(" + (i + 1) + "-" + cantidad + ") --> ");
            int numero = entrada.nextInt();

            if (i == 0) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }   
        }

        System.out.println("\nEl numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        entrada.close();

    }
}
