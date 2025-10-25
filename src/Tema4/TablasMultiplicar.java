package Tema4;

public class TablasMultiplicar {
    public static void main(String[] args) {
        
        for (int i = 1; i < 10; i++) { 
            System.out.println("Tabla de Multiplicar del " + i);

            for (int j = 0; j < 10; j++) {

                System.out.println(i + " * " + j + " = " + i*j);
                               
            }

            System.out.println();
        }
    }
}
