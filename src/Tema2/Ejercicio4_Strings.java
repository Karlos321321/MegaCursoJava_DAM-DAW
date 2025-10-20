package Tema2;
import java.util.Scanner;

public class Ejercicio4_Strings {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase --> ");
        String frase = entrada.nextLine();
         
        if (frase.equalsIgnoreCase(new StringBuilder(frase).reverse().toString())) {
            System.out.println("Es un Palíndromo.");
        } else {
            System.out.println("No es un Palíndromo.");
        }

        entrada.close(); 
    }
}

