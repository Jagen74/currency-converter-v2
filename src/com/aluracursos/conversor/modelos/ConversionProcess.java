package com.aluracursos.conversor.modelos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversionProcess {

    public void conversion (){

        ApiClient apiResponse = new ApiClient();
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        Scanner kb = new Scanner(System.in);

        System.out.println("Ingresa moneda origen (ej: USD, EUR):");
        String currBase = kb.nextLine().toUpperCase();

        System.out.println("Ingresa moneda destino (ej: MXN, JPY):");
        String currTarget = kb.nextLine().toUpperCase();

        System.out.println("Ingresa el monto a convertir:");
        Double amount = kb.nextDouble();
        kb.nextLine();

        CurrencyData currencyData = apiResponse.conversion(currBase, currTarget, amount);

        String mensaje = "$" + nf.format(amount) + " " + currencyData.base_code() + " convertidos a "
                + currencyData.target_code() + " equivalen a $" + nf.format(currencyData.conversion_result())
                + " " + currTarget;

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String linea = "[" + timestamp + "]" + " "+ mensaje + System.lineSeparator();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Historial.txt", true))) {
            writer.write(linea);
        } catch (IOException e) {
            System.err.println("Error al guardar en el historial: " + e.getMessage());
        }
        System.out.println(mensaje);
    }
}