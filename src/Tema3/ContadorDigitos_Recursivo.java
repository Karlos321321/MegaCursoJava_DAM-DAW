package Tema3;

public class ContadorDigitos_Recursivo {

    public static void main(String[] args) {
    
        int n=5;
        mostrarDigitos(n);
    }

    static void mostrarDigitos(int n){
        System.out.println("el numero " + n + " tiene " + digitos(n) + (digitos(n)==1 ? " digito" : " digitos"));
    }

    static int digitos(int n){
        if (n==0) return 0;
            else return 1 + digitos(n/10);
    }
}
