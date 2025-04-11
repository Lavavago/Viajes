package com.viajesya.mapper;

import com.viajesya.dto.ViajeDTO;
import com.viajesya.entity.Viaje;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-06T19:17:43-0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.6 (OpenLogic)"
)
@Component
public class ViajeMapperImpl implements ViajeMapper {

    @Override
    public Viaje dtoToViaje(ViajeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Viaje viaje = new Viaje();

        viaje.setId( dto.getId() );
        viaje.setOrigen( dto.getOrigen() );
        viaje.setDestino( dto.getDestino() );
        viaje.setFechaSalida( dto.getFechaSalida() );
        viaje.setFechaLlegada( dto.getFechaLlegada() );
        viaje.setPrecio( dto.getPrecio() );

        return viaje;
    }

    @Override
    public ViajeDTO viajeToDto(Viaje viaje) {
        if ( viaje == null ) {
            return null;
        }

        ViajeDTO viajeDTO = new ViajeDTO();

        viajeDTO.setId( viaje.getId() );
        viajeDTO.setOrigen( viaje.getOrigen() );
        viajeDTO.setDestino( viaje.getDestino() );
        viajeDTO.setFechaSalida( viaje.getFechaSalida() );
        viajeDTO.setFechaLlegada( viaje.getFechaLlegada() );
        viajeDTO.setPrecio( viaje.getPrecio() );

        return viajeDTO;
    }
}
