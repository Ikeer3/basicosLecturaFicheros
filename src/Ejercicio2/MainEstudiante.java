package Ejercicio2;

import java.io.*;

public class MainEstudiante {
    public static void main(String[] args) throws IOException {

//        Ejercicio 2: guardar y recuperar datos estructurados
//        - Crea una clase Estudiante que tenga nombre, apellido1 e id (numérico).
//        - En un Main, crea un estudiante y guarda la información en disco, en formato
//              Nombre: Ismael
//              Apellido1: Hasan
//              Id: 111
//        - Después, leer la información de disco, y construye un objeto Estudiante con esa información que has leído.

        Estudiante estudiante1 = new Estudiante("Erik", "Santos", 123);
        String fichero = "estudiante.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
        bw.write("Nombre: " + estudiante1.getNombre() + "\n" + "Apellido1: " + estudiante1.getApellido()
                + "\n" + "Id: " + estudiante1.getId());
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(fichero));

        String lineaNombre = br.readLine();
        String nombreLeido = lineaNombre.split(": ")[1];

        String lineaApellido = br.readLine();
        String apellidoLeido = lineaApellido.split(": ")[1];

        String lineaId = br.readLine();
        String textoLeido = lineaId.split(": ")[1];
        int idLeido = Integer.parseInt(textoLeido);

        br.close();

        Estudiante estudianteReader = new Estudiante(nombreLeido, apellidoLeido, idLeido);
        System.out.println("\n---DATOS RECUPERADOS---");
        System.out.println(estudianteReader);
    }
}
