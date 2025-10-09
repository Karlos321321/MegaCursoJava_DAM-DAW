import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cuantos numeros quieres introducir ?");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un n��mero: ");
            int numero = entrada.nextInt();
            
            if (numero > 100) {
                System.out.println("El n��mero es mayor que 100.");
            } else if (numero < 100) {
                System.out.println("El n��mero es menor que 100.");
            } else {
                System.out.println("El n��mero es igual a 100.");
            }
        }
    }
}
