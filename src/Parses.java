public class Parses {
    public static void main(String[] args) {
        
        char num = '5';
        /*int parsedNum = Integer.parseInt(String.valueOf(num));
        System.out.println("Parsed integer: " + parsedNum);

        String cadena = "123456789";
        int parsedCadena = Integer.parseInt(cadena);
        System.out.println("Parsed integer from string: " + parsedCadena);

        char letra = 'A';
        int numeroLetra = (int) letra;
        String letraToString = Character.toString(letra);

        System.out.println("Parsed integer from char: " + numeroLetra);
        System.out.println("Char to String: " + letraToString); */

        int a = Character.getNumericValue(num);
        System.out.println(a);
          
    }
}
