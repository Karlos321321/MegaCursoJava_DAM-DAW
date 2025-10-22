package Tema3;

public class ElevadoaN_Recursivo {
    public static void main(String[] args) {
        
        int base = 5;
        int exponente = 3;
        resulados(base,exponente);
    }

    static void resulados(int b, int e){

        System.out.println(b + " elevado a " + e+ " es: " + elevadoaN(b,e));


    }

    static double elevadoaN(int b , int e){
        
        if (e==0) return 1;
            else {
                return b*elevadoaN(b, e-1);
            }
    }
}
