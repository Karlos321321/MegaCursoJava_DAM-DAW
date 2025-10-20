package Tema3;

public class NumeroalCubo_2 {
    public static void main(String[] args) {
        
        int numero = 5;
        System.out.println("El cubo de " + numero + " es: " + calcularCubo(numero));
    }

    static int calcularCubo(int n) {
        return n * n * n;
    }

}
