package Tema3;

public class InvertidoRecursivo {
    public static void main(String[] args) {
        
        String numero = "123456789";
        invertido(numero);

        System.out.println("La cadena " + numero + " invertida es --> " + invertido(numero));


    }


    static String invertido(String numero){

        String cadenaInvertida="";
        for (int i = numero.length()-1; i>=0 ; i--) {
            cadenaInvertida += numero.charAt(i); 
        
        }

        return cadenaInvertida;
        
    }
}

