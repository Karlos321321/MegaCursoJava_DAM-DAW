package Tema3;

public class Sobrecarga {
    public static void main(String[] args) {

        saludar();
        System.out.println(saludar("Carlos"));
        System.out.println(saludar("Carlos", "Moreno"));
               
        
    }

    static void saludar(){
        System.out.println("Hola");
    }

    static String saludar (String nombre){
        return "Hola " + nombre;
    }

    static String saludar (String nombre, String apellido){
        return "Hola " + nombre + " " + apellido;
    }
}
