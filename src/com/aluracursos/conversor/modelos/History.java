package com.aluracursos.conversor.modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class History {

    public void read(){

        try (BufferedReader reader = new BufferedReader(new FileReader("Historial.txt"))) {
            String line;

            System.out.println("════ Historial de Conversiones ════");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(" ");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
