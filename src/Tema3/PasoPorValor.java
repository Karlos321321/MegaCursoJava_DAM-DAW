package Tema3;

public class PasoPorValor {
    public static void main(String[] args) {
        
        int numero = 10;
        int doble = doble(numero); 
        System.out.println("Valor original: " + numero);
        System.out.println("Doble: " + doble);
    }
    
    static int doble(int num) {
        return num * 2;
    }

}
