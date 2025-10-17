import java.util.Scanner;

public class Ejercicio4_Iniciacion_bis {
    public static void main(String[] args) {
        
        String resultado="";
        int sumaTotal=0;
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("Introduce un número --> ");
            numero = scanner.nextInt();

            int cifra = 1;
            int suma = numero % 10;
            int aux = numero;

            while (aux > 9) {
                aux /= 10;
                cifra++;
                suma += aux % 10;
            }

            if (cifra == suma) {
                resultado += numero + "+";
                sumaTotal += numero;
            }

        } while (numero != 0);

        System.out.println("Números encontrados: " + resultado);
        System.out.println("Suma total: " + sumaTotal);
        
        scanner.close();
    }
}
