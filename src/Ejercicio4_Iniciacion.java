import java.util.Scanner;

public class Ejercicio4_Iniciacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero=1;
        int sumaCifras=0;
        int longitud=0;
        int sumaTotal=0;
        String muestraSumaTotal="";
        String numerosIntroducidos="";

        do {
            
            System.out.println("Introduce un numero positivo: ");
            numero = entrada.nextInt();

            if (numero != 0) {
               numerosIntroducidos += numero + ",";
            }

            String numeroString = String.valueOf(numero);
            longitud = numeroString.length();
            
            for (int i = 0; i < longitud; i++) {
                sumaCifras += Character.getNumericValue(numeroString.charAt(i));   
           }

           if (longitud == sumaCifras && numero > 0) {
                sumaTotal += numero;
                muestraSumaTotal += numero + "+";
            }
                        
        } while (numero != 0);

        System.out.println("Numeros introducidos -->  " + numerosIntroducidos + "\b ");
        System.out.println("Suma Total --> " + muestraSumaTotal + "\b=" + sumaTotal);
        entrada.close();
    }
}
