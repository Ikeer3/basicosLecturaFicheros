package Ejercicio3;

import java.io.*;

public class MainAlumno {
    public static void main(String[] args) throws IOException {

        Alumno alumno1 = new Alumno("Iker", 8);
        String fichero = "alumno.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(fichero));
        bw.write("Nombre: " + alumno1.getNombre() + "\n" + "Nota: " + alumno1.getNota());
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(fichero));
        String lineaNombre = br.readLine();
        String nombreLeido = lineaNombre.split(": ")[1];

        String lineaNota = br.readLine();
        String numeroLeido = lineaNota.split(": ")[1];
        int notaLeida = Integer.parseInt(numeroLeido);

        Alumno alumnoRecuperado = new Alumno(nombreLeido, notaLeida);
        System.out.println("\n---DATOS RECUPERADOS---");
        System.out.println(alumnoRecuperado);
    }
}
