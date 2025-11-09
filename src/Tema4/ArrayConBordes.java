package Tema4;

//Programa modificado en windows
public class ArrayConBordes {

    static final char ESQUINA_SUPERIOR_IZQUIERDA = '╔';
    static final char ESQUINA_SUPERIOR_DERECHA = '╗';
    static final char ESQUINA_INFERIOR_IZQUIERDA = '╚';
    static final char ESQUINA_INFERIOR_DERECHA = '╝';
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    static final char SEPARADOR_SUPERIOR = '╦';
    static final char SEPARADOR_INFERIOR = '╩';

    public static void main(String[] args) {
        int[] numeros = {214,25,111,-15,35611,345,-345345345};
        mostrarArray(numeros);
    }

    static int digitos(int n){
        if (n==0) return 0;
        else return 1 + digitos(n/10);
    }
    //Imprimir los bordes
    static void bordes (int n[] , int b){

        int separador = 0;
        char esquina = (b==0) ? ESQUINA_SUPERIOR_IZQUIERDA : ESQUINA_INFERIOR_IZQUIERDA;
        System.out.print(esquina);
        
        for (int i = 0; i < n.length; i++) {

            if (n[i]<0) separador = digitos(n[i])+4;
            else separador = digitos(n[i])+3;
            
            for (int j = 0; j < separador; j++) {
                if (j!=separador-1) System.out.print(LINEA_HORIZONTAL);
                else if (j==separador-1 && i!=n.length-1) {
                        esquina = (b==0) ? SEPARADOR_SUPERIOR : SEPARADOR_INFERIOR;
                        System.out.print(esquina);
                    } else if (j==separador-1 && i==n.length-1) {
                            esquina = (b==0) ? ESQUINA_SUPERIOR_DERECHA : ESQUINA_INFERIOR_DERECHA;
                            System.out.print(esquina);
                        }       
            }
        }
        System.out.println();
    }

    static void mostrarArray(int n[]){
        //borde superior
        bordes(n , 0);
        //Imprime el contenido de la matriz
        for (int i = 0; i < n.length; i++) {
            System.out.print(LINEA_VERTICAL);
            System.out.print(" " + n[i] + " ");
            if (i==n.length-1) System.out.println(LINEA_VERTICAL);
        }
        //Borde inferior
        bordes(n, 1);
    }
}
