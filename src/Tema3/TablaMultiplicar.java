package Tema3;

public class TablaMultiplicar {
    public static void main(String[] args) {
        
        int numero = 9;
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + multiplicar(numero, i));
        }
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

}
