package co.edu.usbcali.banku.mapper;

import co.edu.usbcali.banku.domain.FacturaServicio;
import co.edu.usbcali.banku.dto.CuentaBancariaDTO;
import co.edu.usbcali.banku.dto.FacturaServicioDTO;

import java.util.List;

public class FacturaServicioMapper {
    public static FacturaServicio dtoToDomain(FacturaServicioDTO facturaServicioDTO){
        return FacturaServicio.builder()
                .idFactura(facturaServicioDTO.getIdFactura())
                .nomEmpresa(facturaServicioDTO.getNomEmpresa())
                .montoFactura(facturaServicioDTO.getMontoFactura())
                .descripFactura(facturaServicioDTO.getDescripFactura())
                .rupFactura(facturaServicioDTO.getRupFactura())
                .fechaFactura(facturaServicioDTO.getFechaFactura())
                .build();
    }
    public static FacturaServicioDTO domainToDto(FacturaServicio facturaServicio){
        return FacturaServicioDTO.builder()
                .idFactura(facturaServicio.getIdFactura())
                .nomEmpresa(facturaServicio.getNomEmpresa())
                .montoFactura(facturaServicio.getMontoFactura())
                .descripFactura(facturaServicio.getDescripFactura())
                .rupFactura(facturaServicio.getRupFactura())
                .fechaFactura(facturaServicio.getFechaFactura())
                .build();
    }

    public static List<FacturaServicio> dtoToDomainList(List<FacturaServicioDTO> facturaServicioDTOS ){
        return facturaServicioDTOS.stream().map(FacturaServicioMapper::dtoToDomain).toList();
    }
    public static List<FacturaServicioDTO> domainToDto(List<FacturaServicio> facturaServicios){
        return facturaServicios.stream().map(FacturaServicioMapper::domainToDto).toList();
    }
}
