package poo.ejercicio3;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverse("Hola Mundo"));

        System.out.println("-".repeat(50) + "\n");
        // 1. Array unidimensional
        String[] nombres = { "Andres", "Felipe", "Rivera"};
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        System.out.println("-".repeat(50) + "\n");
        // 2. Array Bidimensional
        int [][] numeros = {
                {1,2,3,4,5},
                {10,20,30,40,50}
        };
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Fila -> " + i + " Columna -> " + numeros[i][j]);
            }
        }
    }

    public static String  reverse(String texto){
        String res = "";
        for (int i =( texto.length() -1); i >=0; i--) {
            res += texto.charAt(i);
        }

        return res;
    }
}
