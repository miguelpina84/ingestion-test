package com.home.ingestiontest.model.record;

import java.util.List;

public record ClienteRequestDto(
        String nombre,
        String apellido1,
        String apellido2,
        String telefono,
        String email,
        List<VehiculoDto> vehiculos,
        List<ZapatoDto> zapatos
) {
}
