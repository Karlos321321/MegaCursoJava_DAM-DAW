package Tema3;

public class InvertidoRecursivo {
    public static void main(String[] args) {
        
       int numero = 123456789;
       
       invertido(numero);
    }


    static void invertido(int numero){

        if (numero>=0 && numero<10) System.out.println(numero);
            else {
                System.out.print(numero%10); //imprimo el ultimo numero
                invertido(numero/10); //numero de cifras,  
            }
        
    }
}

