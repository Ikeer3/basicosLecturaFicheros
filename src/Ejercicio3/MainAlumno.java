package Ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainAlumno {
    public static void main(String[] args) throws IOException {

        Alumno alumno1 = new Alumno("Iker", 8);
        String fichero = "alumno.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
        bw.write("Nombre: " + alumno1.getNombre() + "\n" + "Nota: " + alumno1.getNota());
        bw.close();
    }
}
