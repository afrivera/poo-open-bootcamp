package poo.ejercicio3;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverse("Hola Mundo"));
    }

    public static String  reverse(String texto){
        String res = "";
        for (int i =( texto.length() -1); i >=0; i--) {
            res += texto.charAt(i);
        }

        return res;
    }
}
