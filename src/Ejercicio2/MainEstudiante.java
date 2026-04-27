package Ejercicio2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainEstudiante {
    public static void main(String[] args) throws IOException {

//        Ejercicio 2: guardar y recuperar datos estructurados
//        - Crea una clase Estudiante que tenga nombre, apellido1 e id (numérico).
//        - En un Main, crea un estudiante y guarda la información en disco, en formato
//              Nombre: Ismael
//              Apellido1: Hasan
//              Id: 111
//        - Después, leer la información de disco, y construye un objeto Estudiante con esa información que has leído.

        Estudiante estudiante1 = new Estudiante("Iker", "Santos", 123);
        String fichero = "estudiante.text";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
        bw.write("Nombre: " + estudiante1.getNombre() + "\n" + "Apellido1: " + estudiante1.getApellido()
                + "\n" + "Id: " + estudiante1.getId());
        bw.close();
    }
}
