package poo.ejercicio3;

import java.util.*;

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

        System.out.println("-".repeat(50) + "\n");
        // 3. Vector
        Vector<String> apellidos = new Vector<>();
        apellidos.add("Zapata");
        apellidos.add("Rivera");
        apellidos.add("Ruiz");
        apellidos.add("Quiñonez");
        apellidos.add("Muelas");

        apellidos.remove(2);
        apellidos.remove(3);

        System.out.println("apellidos = " + apellidos);

        System.out.println("-".repeat(50) + "\n");
        // 4. R/


        // 5. Array List
        ArrayList<String> elementos = new ArrayList<>(Arrays.asList("ElementoA", "ElementoB", "ElementoC", "ElementoD"));
        LinkedList<String> copiaElementos = new LinkedList<>(elementos);

        for (int i = 0; i < elementos.size(); i++) {
            System.out.println("Array ->" + elementos.get(i));
        }
        System.out.println();

        for (int i = 0; i < elementos.size(); i++) {
            System.out.println("Linked ->" + copiaElementos.get(i));
        }

        System.out.println("-".repeat(50) + "\n");
        // 6. ArrayList de Enteros

        ArrayList<Integer> numImpares = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if(i%2 != 0){
                numImpares.add(i);
            }
        }
        System.out.println("numImpares = " + numImpares);
    }

    public static String  reverse(String texto){
        String res = "";
        for (int i =( texto.length() -1); i >=0; i--) {
            res += texto.charAt(i);
        }

        return res;
    }
}
