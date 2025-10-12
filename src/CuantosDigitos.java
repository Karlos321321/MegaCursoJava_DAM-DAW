import java.util.Scanner;

public class CuantosDigitos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
        int cifras = 1;

        while ((numero = numero / 10) != 0) {
            cifras++;
        }   
        
        System.out.println("El numero tiene " + cifras + (cifras==1 ? " digito" : " 1digitos"));
        entrada.close();
        System.out.println(9/10);
    }
}
