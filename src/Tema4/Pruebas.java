package Tema4;

public class Pruebas {

    static final char ESQUINA_SUPERIOR_IZQUIERDA = '╔';
    static final char ESQUINA_SUPERIOR_DERECHA = '╗';
    static final char ESQUINA_INFERIOR_IZQUIERDA = '╚';
    static final char ESQUINA_INFERIOR_DERECHA = '╝';
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    static final char SEPARADOR_SUPERIOR = '╦';
    static final char SEPARADOR_INFERIOR = '╩';

    public static void main(String[] args) {

    int[] numeros = {12,1,123,12345};

    mostrarArray(numeros);

    }

    static int digitos(int n){
        if (n==0) return 0;
        else return 1 + digitos(n/10);
    }

    static void mostrarArray(int n[]){

        //determinar el ancho total 
        int anchoTotal = 0;
        for (int i : n) {
            anchoTotal += digitos(i);
        }
        
        //impresion matriz con bordes
        System.out.print(ESQUINA_SUPERIOR_IZQUIERDA);
        int separador = 0;
        
        //lee las columnas hasta la longitud maxima de la matriz y le añade 2 espacios por colunma
        for (int i = 0; i < n.length; i++) {
            separador = digitos(n[i])+2;
            
            for (int j = 0; j < separador; j++) {

                if (j!=separador-1 && i!=n.length) System.out.print(LINEA_HORIZONTAL);
                    else if (j==separador-1 && i!=n.length-1) System.out.print(SEPARADOR_SUPERIOR);
                        else if (j==separador-1 && i==n.length-1) System.out.println(ESQUINA_SUPERIOR_DERECHA);
            } 
        }



    }

}
