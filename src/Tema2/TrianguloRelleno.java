package Tema2;

public class TrianguloRelleno {
    public static void main(String[] args) {
        
        int altura = 10;

        for (int i = 0; i < altura; i++) {  
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
