package com.aluracursos.conversor.modelos;

public record CurrencyData(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result
) {
}
