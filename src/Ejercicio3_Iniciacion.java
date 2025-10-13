import java.util.Scanner;

public class Ejercicio3_Iniciacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int sumaTotal=0;
        String muestraSumaTotal="";
        String numerosIntroducidos="";

        while (numero!=0) {
            
            System.out.println("Introduce un numero entero positivo ... : ");
            numero = entrada.nextInt();

            if (numero!=0) {
                numerosIntroducidos += numero + ",";
                muestraSumaTotal += numero + "+";
            }
           
            if (numero<0) System.out.println("\nNO INTRODUZCAN NUMEROS NEGATIVOS !!!!!\n");
                else sumaTotal += numero;
        }

        System.out.println("Has introducido un 0, el programa ha terminado\n");
        System.out.println("Numeros introducidos -->" + numerosIntroducidos + "\b ");
        System.out.println("Suma Total --> " + muestraSumaTotal + "\b=" + sumaTotal);
        entrada.close();
    }
}