package Tema3;

public class Metodos {
    public static void main(String[] args) {

        int num1 = 12, num2 = 12;
        int base = 5, altura = 10;

        prueba();

        System.out.println("El area del rectangulo es: " + areaRectangulo(base, altura));

        if (sumaCondicional(num1, num2) == 0) {
            System.out.println("Los numeros no son iguales, el resultado es 0");
            System.out.println("a vale " + num1 + " y b vale " + num2);
        } else {
            System.out.println("Los numeros son iguales, el resultado es: " + sumaCondicional(num1, num2));
        }
        
    }

    static void prueba() {
        System.out.println("Este es un metodo de prueba");
    }


    static int suma (int a, int b) {
            return a + b ;
    }

    static int sumaCondicional (int a, int b) {
        if (a == b) {
            return a + b ;
        } else {
            return 0;
        }
    }

    static int areaRectangulo (int base, int altura) {
        return base * altura;
    }



}
