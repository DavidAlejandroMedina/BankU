package co.edu.usbcali.banku.mapper;

import co.edu.usbcali.banku.domain.Movimiento;
import co.edu.usbcali.banku.dto.MovimientoDTO;

import java.util.List;

public class MovimientoMapper {
    public static Movimiento dtoToDomain(MovimientoDTO movimientoDTO){
        return Movimiento.builder()
                .idMovimiento(movimientoDTO.getIdMovimiento())
                .fechaMovimiento(movimientoDTO.getFechaMovimiento())
                .descripMovimiento(movimientoDTO.getDescripMovimiento())
                .montoMovimiento(movimientoDTO.getMontoMovimiento())
                //.cuentaBancaria(movimientoDTO.getIdCuentaBancaria())
                .build();
    }

    public static MovimientoDTO domainToDto(Movimiento movimiento){
        return MovimientoDTO.builder()
                .idMovimiento(movimiento.getIdMovimiento())
                .fechaMovimiento(movimiento.getFechaMovimiento())
                .descripMovimiento(movimiento.getDescripMovimiento())
                .montoMovimiento(movimiento.getMontoMovimiento())
                //.idCuentaBancaria(movimiento.getCuentaBancaria())
                .build();
    }

    public static List<Movimiento> dtoToDomainList(List<MovimientoDTO> movimientoDTOS){
        return movimientoDTOS.stream().map(MovimientoMapper::dtoToDomain).toList();
    }

    public static List<MovimientoDTO> domainToDtoList(List<Movimiento> movimientos){
        return movimientos.stream().map(MovimientoMapper::domainToDto).toList();
    }
}
