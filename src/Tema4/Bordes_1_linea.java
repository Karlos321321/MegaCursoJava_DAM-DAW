package Tema4;

public class Bordes_1_linea {

    static final char ESQUINA_SUPERIOR_IZQUIERDA = '╔';
    static final char ESQUINA_SUPERIOR_DERECHA = '╗';
    static final char ESQUINA_INFERIOR_IZQUIERDA = '╚';
    static final char ESQUINA_INFERIOR_DERECHA = '╝';
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    public static void main(String[] args) {

        String cadena = "Programacion en Java".toUpperCase();
        mostrarTitulo(cadena);
    }

    static void mostrarTitulo(String titulo){

        //Creamos la cadena nueva
        String cadenaNueva = "";
        for (int i = 0; i < titulo.length(); i++) {
            cadenaNueva += titulo.charAt(i) + " ";
        }

        //Marco superior
        System.out.print(ESQUINA_SUPERIOR_IZQUIERDA);
        for (int i = 0; i < cadenaNueva.length()+3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.print(ESQUINA_SUPERIOR_DERECHA);

        //linea
        System.out.println();
        System.out.print(LINEA_VERTICAL);
        System.out.println("  " + cadenaNueva + " " + LINEA_VERTICAL);

        //Marco inferior
        System.out.print(ESQUINA_INFERIOR_IZQUIERDA);
        for (int i = 0; i < cadenaNueva.length()+3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.print(ESQUINA_INFERIOR_DERECHA);
 
    }
}
