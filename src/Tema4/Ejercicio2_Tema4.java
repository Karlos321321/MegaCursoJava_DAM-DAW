package Tema4;

public class Ejercicio2_Tema4 {
    public static void main(String[] args) {
        
        String[] nombres = {"Pepe","Dorotea","MariaDelCarmen","CarlosJavier","FranciscoJose","Rossana","Rosalia","Esta es la palabra mas LARGA"};
        int longitud=0;
        String palabraMasLarga="";

        mostrarPorPantalla(cadenaMasLarga(nombres , longitud , palabraMasLarga));
    }

    static void mostrarPorPantalla(String m){

         System.out.println("La palabra mas larga es " + m + " y tiene " + m.length() + " letras");
    }
    
    static String cadenaMasLarga(String[] array , int l, String palabra){

        for (int i = 0; i < array.length; i++) {

            if (array[i].length()>l) {
                palabra=array[i];
                l = array[i].length();
            }
        }
        return palabra;
    } 
}
