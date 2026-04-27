import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {


//        Ejercicio 1: escribir en un fichero
//        - Crea un programa que lea por teclado 3 frases.
//        - Después, tiene que escribirlas en un fichero.
//        - Finalmente, tiene que leer el mismo fichero, línea a línea, e imprimir "Línea X: " + el contenido. ".
//
//        IMPORTANTE:
//        - Aunque leamos 3 frases sólo, no las almacenes en 3 variables. Utiliza una LISTA para almacenarlas.
//        - Aunque leamos 3 frases sólo, no imprimas 3 veces. Leer el fichero en un bucle, línea a línea, hasta acabar.
//        - Tendrás que capturar (catch) las excepciones que lanzan las clases de lectura/escritura de ficheros.

        Scanner escaner = new Scanner(System.in);
        ArrayList<String> listaFrases = new ArrayList<>();
        String fichero = "ejemplo.txt";

        System.out.println("\nIntroduce 3 frases");
        for (int i = 0; i < 3; i++) {
            System.out.print("Frase " + (i+1) + ": ");
            listaFrases.add(escaner.nextLine());
        }

        BufferedWriter escritor = new BufferedWriter(new FileWriter(fichero));
        for (String str: listaFrases) {
            escritor.write(str);
            escritor.newLine();
        }
        escritor.close();

        BufferedReader lector = new BufferedReader(new FileReader(fichero));
        String resultado = "";
        String linea = lector.readLine();
        while (linea != null) {
            resultado = resultado + linea + "\n";
            linea = lector.readLine();
        }

        lector.close();
        System.out.print("\n" + resultado);
    }
}