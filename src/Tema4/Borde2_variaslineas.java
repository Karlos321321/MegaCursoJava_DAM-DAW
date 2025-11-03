package Tema4;

public class Borde2_variaslineas {

    static final char ESQUINA_SUPERIOR_IZQUIERDA = '╔';
    static final char ESQUINA_SUPERIOR_DERECHA = '╗';
    static final char ESQUINA_INFERIOR_IZQUIERDA = '╚';
    static final char ESQUINA_INFERIOR_DERECHA = '╝';
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    public static void main(String[] args) {

         String cadena = """
                Programacion en JAVA
                Tema 4
                Estamos haciendo ejercicios de repaso
                """;

        bordes(crearCadenaNueva(cadena));
    }

    static void bordes(String n[]){
        //Determinamos la cadena mas larga
        int lineaMaxima = 0;
        for (String linea : n) {
            if (lineaMaxima < linea.length()) lineaMaxima = linea.length();
        }
        // Borde superior
        System.out.print(ESQUINA_SUPERIOR_IZQUIERDA);
        for (int i = 0; i < lineaMaxima+4 ; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.println(ESQUINA_SUPERIOR_DERECHA);
        //linea verticales y texto
        for (int i = 0; i < n.length; i++) {
            System.out.print(LINEA_VERTICAL);
            System.out.print("   " + n[i]);

            for (int j = n[i].length(); j <= lineaMaxima; j++) {
                System.out.print(" ");
                if (j==lineaMaxima) System.out.print(LINEA_VERTICAL); 
            }
            System.out.println();
        }
        // Borde inferior
        System.out.print(ESQUINA_INFERIOR_IZQUIERDA);
        for (int i = 0; i < lineaMaxima+4 ; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.print(ESQUINA_INFERIOR_DERECHA);
    }

    static String[] crearCadenaNueva(String titulo){

        String[] lineas = titulo.toUpperCase().split("\\n");

        for (int i = 0; i < lineas.length; i++) {
                String cadenaNueva="";
                //creando filas nuevas con espacios
                for (int j = 0; j < lineas[i].length(); j++) {
                    cadenaNueva += lineas[i].charAt(j) + " ";
                }
                //creo el nuevo array
                lineas[i] = cadenaNueva;
        }
        //devuelvo el array con la cadena nueva en mayusculas y con espacios
        return lineas;
    }
}
