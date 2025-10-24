package Tema3;

public class EsBinario {

    public static void main(String[] args) {

        int n = 1001;
        
        if (Binario(n)) System.out.println("Es un nunmero binario");
            else System.out.println("NO es un nunmero binario");
    }

    static boolean Binario(int n){

        if(n>=0 && n<10) {
        
            if (n==0 || n==1) return true;
            return false;
        }

        if(n%10==0 || n%10==1) return Binario(n/10);
        return false;

    }
}
