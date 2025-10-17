import java.util.Scanner;

public class Ejercicio3_Strings {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una frase --> ");
        String frase = entrada.nextLine().trim();
        int palabras = 1;

        for (int i = 0; i<frase.length(); i++) {
            if (frase.charAt(i) == ' ' && frase.charAt(i+1) !=' ') palabras++;
        }

        if (frase.isEmpty()) {
            palabras = 0;
        }

        System.out.println("La frase tiene " + (palabras) + " palabras.");
        entrada.close();
    }
}

