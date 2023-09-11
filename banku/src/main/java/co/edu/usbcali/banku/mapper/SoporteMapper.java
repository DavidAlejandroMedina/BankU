package co.edu.usbcali.banku.mapper;

import co.edu.usbcali.banku.domain.Soporte;
import co.edu.usbcali.banku.dto.SoporteDTO;

import java.util.List;

public class SoporteMapper {
    public static Soporte dtoToDomain(SoporteDTO soporteDTO){
        return Soporte.builder()
                .idSoporte(soporteDTO.getIdSoporte())
                .tipoSoporte(soporteDTO.getTipoSoporte())
                .descripSoporte(soporteDTO.getDescripSoporte())
                .estadoSoporte(soporteDTO.getEstadoSoporte())
                //.usuario(soporteDTO.getIdUsuario())
                .build();
    }

    public static SoporteDTO domainToDto(Soporte soporte){
        return SoporteDTO.builder()
                .idSoporte(soporte.getIdSoporte())
                .tipoSoporte(soporte.getTipoSoporte())
                .descripSoporte(soporte.getDescripSoporte())
                .estadoSoporte(soporte.getEstadoSoporte())
                //.idUsuario(soporte.getUsuario())
                .build();
    }

    public static List<Soporte> dtoToDomainList(List<SoporteDTO> soporteDTOS){
        return soporteDTOS.stream().map(SoporteMapper::dtoToDomain).toList();
    }

    public static List<SoporteDTO> domainToDtoList(List<Soporte> soportes){
        return soportes.stream().map(SoporteMapper::domainToDto).toList();
    }
}
