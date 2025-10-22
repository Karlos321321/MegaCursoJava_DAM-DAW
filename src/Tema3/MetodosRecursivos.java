package Tema3;

public class MetodosRecursivos {
    public static void main(String[] args) {

    int n = 4;

    System.out.println("El factorial de " + n + " es --> " + factorial(n));
        
    }

    static int factorial(int n){

        if(n==0) return 1;
            else return n*factorial(n-1);
                            
    }
}
