package co.edu.usbcali.banku.mapper;

import co.edu.usbcali.banku.domain.Usuario;
import co.edu.usbcali.banku.dto.UsuarioDTO;

import java.util.List;

public class UsuarioMapper {
    public static Usuario dtoToDomain(UsuarioDTO usuarioDTO){
        return Usuario.builder().idUsuario(usuarioDTO.getIdUsuario())
                .nombre(usuarioDTO.getNombre())
                .apellido(usuarioDTO.getApellido())
                .correo(usuarioDTO.getCorreo())
                .clave(usuarioDTO.getClave()).build();
    }

    public static UsuarioDTO domaintoDTO(Usuario usuario){
        return UsuarioDTO.builder().idUsuario(usuario.getIdUsuario())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .correo(usuario.getCorreo())
                .clave(usuario.getClave()).build();
    }

    public List<Usuario> dtoToDomainList(List<UsuarioDTO> usuarioDTO){
        return usuarioDTO.stream().map(UsuarioMapper::dtoToDomain).toList();
    }

    public List<UsuarioDTO> domainToDtoList(List<Usuario> usuario){
        return usuario.stream().map(UsuarioMapper::domaintoDTO).toList();
    }
}
