package Tema3;

public class Prueba_Tema3 {
    public static void main(String[] args) {

        int num = 3;
        int res = proceso1(num);
        System.out.println("El resultado es: " + res);
          
    }

    static int proceso1(int n1){
        int p1 = 1;
        for (int i = 0; i < n1; i++) {
            p1 += proceso2(i);
        }
        return p1;
    } 
    
    static int proceso2(int n2){
        int p2 = 1;
        for (int i = 0; i < n2; i++) {
            p2 += n2;
        }
        return p2;
    }
}
