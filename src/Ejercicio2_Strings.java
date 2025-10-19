import java.util.Scanner;

public class Pruebas_Java {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String totalPalabrasIntroducidas="";
        String PalabrasLongitudMayor="";
        int longitudMayort=0;

        for (int i=0; i<5 ; i++) {
            System.out.println("Introduce 5 palabras (" + (i+1) + "-5) --> ");
            String palabra = entrada.nextLine().trim();

            totalPalabrasIntroducidas += palabra + " , ";

            if (palabra.length() > longitudMayort) {
                longitudMayort = palabra.length();
                PalabrasLongitudMayor = palabra;
            
            } else if (palabra.length() == longitudMayort) {
                    PalabrasLongitudMayor += ", " + palabra;
                }
        }

        System.out.println("Palabras Introducidas: MENSAJE DE PRUEBA" + totalPalabrasIntroducidas);
        System.out.println("Palabras con longitud mayor (" + longitudMayort + "): " + PalabrasLongitudMayor);

        entrada.close();
    }
}
