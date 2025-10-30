package Tema4;

public class pruebas_Tema4 {
    public static void main(String[] args) {

        String cadena = """ 
            Programacion en Java
            Tema 4
            Estamos haciendo ejercicios de repaso""".toUpperCase();

        String cadenaNueva="";

        for (int i = 0; i < cadena.length(); i++) {
            cadenaNueva += cadena.charAt(i) + "  ";
        }

        System.out.print("\u2554");

        for (int i=0 ; i<cadenaNueva.length()+4; i++){
             System.out.print("\u2550");
        }

        System.out.print("\u2557");
       
        System.out.println();
        System.out.print("\u2551");
       
        System.out.print("   " + cadenaNueva + " ");
        System.out.print("\u2551");

        System.out.println();
        System.out.print("\u255A");

        for (int i=0 ; i<cadenaNueva.length()+4; i++){
             System.out.print("\u2550");
        }  
    }
}
