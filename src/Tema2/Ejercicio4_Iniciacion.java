package Tema2;
import java.util.Scanner;

public class Ejercicio4_Iniciacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int sumaCifras=0;
        int sumaTotal=0;
        String muestraSumaTotal="";
        String numerosIntroducidos="";
        String numeroString="";

        do {
            
            System.out.println("Introduce un numero positivo: ");
            numeroString = entrada.nextLine();

            if (Integer.parseInt(numeroString) != 0) {
                numerosIntroducidos += numeroString + ",";
            }

            for (int i = 0; i < numeroString.length(); i++) {
                sumaCifras += Character.getNumericValue(numeroString.charAt(i));
            }

            if (numeroString.length()==sumaCifras) {
                muestraSumaTotal += numeroString + "+";
                sumaTotal += Integer.parseInt(numeroString);
            }

            sumaCifras = 0;
            
        } while (Integer.parseInt(numeroString) != 0);

        System.out.println("Numeros introducidos: " + numerosIntroducidos + "\b ");
        System.out.println("Numeros cuya suma de cifras es igual a su longitud: " + muestraSumaTotal + "\b= " + sumaTotal);
            
        entrada.close();
    }
}
