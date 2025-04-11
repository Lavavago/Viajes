package com.viajesya.mapper;

import com.viajesya.dto.UsuarioDTO;
import com.viajesya.entity.Usuario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-06T19:17:44-0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.6 (OpenLogic)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario createDTOToUsuario(UsuarioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( dto.getId() );
        usuario.setNombre( dto.getNombre() );
        usuario.setEmail( dto.getEmail() );
        usuario.setContrasenna( dto.getContrasenna() );
        usuario.setFechaNacimiento( dto.getFechaNacimiento() );

        return usuario;
    }

    @Override
    public UsuarioDTO usuarioToResponseDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setId( usuario.getId() );
        usuarioDTO.setNombre( usuario.getNombre() );
        usuarioDTO.setEmail( usuario.getEmail() );
        usuarioDTO.setContrasenna( usuario.getContrasenna() );
        usuarioDTO.setFechaNacimiento( usuario.getFechaNacimiento() );

        return usuarioDTO;
    }
}
