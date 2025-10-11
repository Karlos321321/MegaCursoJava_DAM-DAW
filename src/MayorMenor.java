import java.util.Scanner;

//=================================================
//PROGRAMA QUE CALCULA EL NUMERO MAYOR Y MENOR !!!!
//=================================================

public class MayorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Maximo = 0;
        int Minimo = 0;
        int contadorMaximo = 1;
        int contadorMinimo = 1;
        
        System.out.println("\nMAYOR Y MENOR DE N NUMEROS");
        System.out.println("===========================\n");
        
        System.out.println("Cuantos numeros quieres introducir ?");
        int cantidad = entrada.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un numero(" + (i + 1) + "-" + cantidad + ") --> ");
            int numero = entrada.nextInt();
           
            if (i == 0) {
                Maximo = numero;
                Minimo = numero;
            } else {
                //Nuevo MAximo
                if (numero > Maximo) {
                    Maximo = numero;
                    contadorMaximo = 1;
                    //Mismo maximo
                    } else if (numero == Maximo) {
                        contadorMaximo++;
                    } 
                //Nuevo Minimo      
                if (numero < Minimo) {
                    Minimo = numero;
                    contadorMinimo = 1;
                    //Mismo minimo
                    } else if (numero == Minimo) {
                        contadorMinimo++;
                    }
            }  
        }

        String resultado;

        System.out.println("\nEl numero mayor es: " + Maximo + " y aparece " + contadorMaximo + " " + (resultado = contadorMaximo==1 ? "vez" : "veces"));
        System.out.println("\nEl numero menor es: " + Minimo + " y aparece " + contadorMinimo + " " + (resultado = contadorMinimo==1 ? "vez" : "veces"));
        
        entrada.close();
    }
}
