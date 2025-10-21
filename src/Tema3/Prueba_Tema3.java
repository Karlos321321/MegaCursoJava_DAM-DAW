package Tema3;

public class Prueba_Tema3 {

    static int numero=5;
    public static void main(String[] args) {

        int numero=10;
        numero = cubo(numero);
        System.out.println(numero);

    }

    static int cubo(int n){
        return n*n*n;
    }   
}
