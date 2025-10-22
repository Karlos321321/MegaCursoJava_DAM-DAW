package Tema3;

public class TrainguloRecursivo {
    public static void main(String[] args) {

        MetodoRecursivo(0,0,10);
    }

    static void MetodoRecursivo(int contadorbase, int contadoraltura, int altura){

        if (contadorbase<contadoraltura) {
            System.out.print("* ");
            MetodoRecursivo(contadorbase+1, contadoraltura, altura);
        } else {
            System.out.println();
            if (contadoraltura<altura) {
                MetodoRecursivo(0,contadoraltura+1,altura);
            }

        }
    }
}
