package Tema3;

public class ParImpar {
    public static void main(String[] args) {
        
        int numero = 5;
        if (esPar(numero)) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
    
    static boolean esPar(int n) {
        return n % 2 == 0;
    }

}
