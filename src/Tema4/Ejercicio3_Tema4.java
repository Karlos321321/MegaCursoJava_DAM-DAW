package Tema4;

public class Ejercicio3_Tema4 {
    public static void main(String[] args) {

        String[] nombres = {"Pepe","Dorotea","PariaDelCarmen","DarlosJavier","FranciscoJose","Possana","Dosalia","Esta es la palabra mas LARGA"};
        char letra = 'P';
        EmpiezaporCHAR(nombres, letra);
    }

    static void EmpiezaporCHAR(String[] nom, char l){

        String palabras_letra="";
        for (int i = 0; i < nom.length; i++) {
            if (nom[i].charAt(0)==l) palabras_letra+=nom[i]+ " ";
        }
        System.out.println("Palabras que empiezan por la letra " + l + " --> " + palabras_letra);
    }
}
