package co.edu.usbcali.banku.mapper;

import co.edu.usbcali.banku.domain.CuentaBancaria;
import co.edu.usbcali.banku.dto.CuentaBancariaDTO;

import java.util.List;

public class CuentaBancariaMapper {
    public static CuentaBancaria dtoToDomain(CuentaBancariaDTO cuentaBancariaDTO){
        return CuentaBancaria.builder()
                .idCuentaBancaria(cuentaBancariaDTO.getIdCuentaBancaria())
                .saldoDisponible(cuentaBancariaDTO.getSaldoDisponible())
                .codigoRetiro(cuentaBancariaDTO.getCodigoRetiro())
                .saldoColchon(cuentaBancariaDTO.getSaldoColchon())
                .build();
    }

    public static CuentaBancariaDTO domainToDto(CuentaBancaria cuentaBancaria){
        return CuentaBancariaDTO.builder()
                .idCuentaBancaria(cuentaBancaria.getIdCuentaBancaria())
                .saldoDisponible(cuentaBancaria.getSaldoDisponible())
                .codigoRetiro(cuentaBancaria.getCodigoRetiro())
                .saldoColchon(cuentaBancaria.getSaldoColchon())
                .build();
    }

    public static List<CuentaBancaria> dtoToDomainList(List<CuentaBancariaDTO> cuentaBancariaDTOS){
        return cuentaBancariaDTOS.stream().map(CuentaBancariaMapper::dtoToDomain).toList();
    }

    public static List<CuentaBancariaDTO> domainToDtoList(List<CuentaBancaria> cuentaBancarias){
        return cuentaBancarias.stream().map(CuentaBancariaMapper::domainToDto).toList();
    }


}
