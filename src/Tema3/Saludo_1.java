package Tema3;

public class Saludo_1 {
    public static void main(String[] args) {
        
        String nombre = "Carlos";
        System.out.println(obtenerSaludo(nombre));
    }

    static String obtenerSaludo(String nombre) {
        return "Hola " + nombre + ", bienvenido al curso de Java";
    }


}
