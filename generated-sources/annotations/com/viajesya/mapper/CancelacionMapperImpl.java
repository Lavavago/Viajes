package com.viajesya.mapper;

import com.viajesya.dto.CancelacionDto;
import com.viajesya.entity.Cancelacion;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-06T19:17:44-0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.6 (OpenLogic)"
)
@Component
public class CancelacionMapperImpl implements CancelacionMapper {

    @Override
    public Cancelacion DtoToCancelacion(CancelacionDto dto) {
        if ( dto == null ) {
            return null;
        }

        Cancelacion cancelacion = new Cancelacion();

        if ( dto.getId() != null ) {
            cancelacion.setId( dto.getId().longValue() );
        }
        cancelacion.setMotivo( dto.getMotivo() );
        cancelacion.setDescripcion( dto.getDescripcion() );
        cancelacion.setFechaCancelacion( dto.getFechaCancelacion() );

        return cancelacion;
    }

    @Override
    public CancelacionDto cancelacionToDto(Cancelacion cancelacion) {
        if ( cancelacion == null ) {
            return null;
        }

        CancelacionDto cancelacionDto = new CancelacionDto();

        if ( cancelacion.getId() != null ) {
            cancelacionDto.setId( cancelacion.getId().intValue() );
        }
        cancelacionDto.setMotivo( cancelacion.getMotivo() );
        cancelacionDto.setDescripcion( cancelacion.getDescripcion() );
        cancelacionDto.setFechaCancelacion( cancelacion.getFechaCancelacion() );

        return cancelacionDto;
    }
}
