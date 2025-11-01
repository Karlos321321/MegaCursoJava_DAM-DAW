package Tema4;

public class Pruebas {

    static final char ESQUINA_SUPERIOR_IZQUIERDA = '╔';
    static final char ESQUINA_SUPERIOR_DERECHA = '╗';
    static final char ESQUINA_INFERIOR_IZQUIERDA = '╚';
    static final char ESQUINA_INFERIOR_DERECHA = '╝';
    static final char LINEA_HORIZONTAL = '═';
    static final char LINEA_VERTICAL = '║';
    public static void main(String[] args) {

         String cadena = """
                Programacion en Java
                Todo el verano
                del año 2006
                """.toUpperCase();

        bordeSuperior();
        mostrarTitulo(cadena);
        
    }

    static void bordeSuperior(){

        System.out.print(ESQUINA_SUPERIOR_IZQUIERDA);
        for (int i = 0; i < cadenaNueva.length()+3; i++) {
            System.out.print(LINEA_HORIZONTAL);
        }
        System.out.print(ESQUINA_SUPERIOR_DERECHA);



    }

    static void mostrarTitulo(String titulo){

        //Detectar la cadena mas larga
        int cadenaMasLarga = 0;

        String[] lineas = titulo.split("\\n");

       for (int i = 0; i < lineas.length; i++) {
            String cadenaNueva = "";
            //longitud de cada fila
            //System.out.println(lineas[i].length() );
            //creando filas nuevas con espacios
            for (int j = 0; j < lineas[i].length(); j++) {
                 cadenaNueva += lineas[i].charAt(j) + " ";
            }

            System.out.println(cadenaNueva);
       }
    }


}
