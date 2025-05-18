package com.aluracursos.conversor.modelos;

import java.util.Scanner;

public class Menu {

    public void menuPrincipal (){

        Scanner kb = new Scanner(System.in);
        ConversionProcess conversionProcess = new ConversionProcess();
        CurrencyList currencyList = new CurrencyList();
        History history = new History();

        loop:
        while (true){

            System.out.println("""
                    ══════════════════════════════════════
                      BIENVENIDO AL CONVERSOR DE MONEDAS
                    ══════════════════════════════════════
                    1. Convertir Monedas.
                    2. Mostrar lista de Divisas.
                    3. Mostrar historial de conversiones.
                    0. Salir.
                    
                    Selecciona una opción:
                    """);

            int option = kb.nextInt();

            switch (option) {
                case 1 -> conversionProcess.conversion();
                case 2 -> currencyList.currencies();
                case 3 -> history.read();
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    break loop;
                }
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}