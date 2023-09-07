package co.edu.usbcali.banku.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CuentaBancariaDTO {
    private String idCuentaBancaria;
    private BigDecimal saldoDisponible;
    private Integer codigoRetiro;
    private BigDecimal saldoColchon;
    private String idUsuario;

    //private List<Movimiento>
}
