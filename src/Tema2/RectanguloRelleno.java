package Tema2;

public class RectanguloRelleno {
    public static void main(String[] args) {

        int base = 10;
        int alto = 5;

        for (int i = 0; i < alto; i++) {  
            for (int j = 0; j < base; j++) {
                
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
