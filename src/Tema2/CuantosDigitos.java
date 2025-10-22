package Tema2;
import java.util.Scanner;

public class CuantosDigitos {
    public static void main(String[] args) {
        
        //int sumaCifras=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = entrada.nextInt();
       
        int cifras = 1;

        while ((numero = numero / 10) != 0) {
            cifras++;
            //sumaCifras += (numero % 10);
        }

        

        System.out.println("El numero tiene " + cifras + (cifras==1 ? " digito" : " digitos"));
        //System.out.println("La suma de sus cifras es " + sumaCifras);
        entrada.close();
    }
}
