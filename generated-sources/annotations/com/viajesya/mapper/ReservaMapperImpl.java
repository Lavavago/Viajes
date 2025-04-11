package com.viajesya.mapper;

import com.viajesya.dto.ReservaDto;
import com.viajesya.entity.Reserva;
import com.viajesya.entity.Usuario;
import com.viajesya.entity.Viaje;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-06T19:17:44-0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.6 (OpenLogic)"
)
@Component
public class ReservaMapperImpl implements ReservaMapper {

    @Autowired
    private CancelacionMapper cancelacionMapper;

    @Override
    public Reserva createDtoToReserva(ReservaDto dto) {
        if ( dto == null ) {
            return null;
        }

        Reserva reserva = new Reserva();

        reserva.setId( dto.getId() );
        reserva.setAsientosReservados( dto.getAsientosReservados() );
        reserva.setCancelacion( cancelacionMapper.DtoToCancelacion( dto.getCancelacion() ) );

        return reserva;
    }

    @Override
    public ReservaDto reservaToResponseDto(Reserva reserva) {
        if ( reserva == null ) {
            return null;
        }

        ReservaDto reservaDto = new ReservaDto();

        Long id = reservaUsuarioId( reserva );
        if ( id != null ) {
            reservaDto.setUsuarioId( id.intValue() );
        }
        Long id1 = reservaViajeId( reserva );
        if ( id1 != null ) {
            reservaDto.setViajeId( id1.intValue() );
        }
        reservaDto.setId( reserva.getId() );
        reservaDto.setAsientosReservados( reserva.getAsientosReservados() );
        reservaDto.setCancelacion( cancelacionMapper.cancelacionToDto( reserva.getCancelacion() ) );

        return reservaDto;
    }

    private Long reservaUsuarioId(Reserva reserva) {
        Usuario usuario = reserva.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        return usuario.getId();
    }

    private Long reservaViajeId(Reserva reserva) {
        Viaje viaje = reserva.getViaje();
        if ( viaje == null ) {
            return null;
        }
        return viaje.getId();
    }
}
