package Tema3;

public class InvertidoRecursivo {
    public static void main(String[] args) {
        
       int numero = 5001;
       
       invertido(numero);
    }

    static void invertido(int numero){

        if (numero>=0 && numero<10) System.out.println(numero); // CASE BASE: cuando el numero es una 1 cifra (1-9)
            else { // CASO GENERAL: cuando el numero tiene 2 cifras o mas 
                
                System.out.print(numero%10); //imprime el ultimo numero
                invertido(numero/10); //descontado cifras cifras
            }
    }
}
