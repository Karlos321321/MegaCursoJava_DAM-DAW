import java.util.Scanner;

public class Ejercicio2_Strings {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String palabraMasLarga="";

        for (int i=0; i<5 ; i++) {
            System.out.println("Introduce 5 palabras --> ");
            String palabra = entrada.nextLine();

            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga + " y su longitud es: " + palabraMasLarga.length());
        entrada.close();
    }
}
