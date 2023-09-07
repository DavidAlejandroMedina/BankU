package co.edu.usbcali.banku.dto;

import co.edu.usbcali.banku.domain.Movimiento;
import co.edu.usbcali.banku.domain.Usuario;

import java.math.BigDecimal;

public class CuentaBancariaDTO {
    private String idCuentaBancaria;
    private BigDecimal saldoDisponible;
    private Integer codigoRetiro;
    private BigDecimal saldoColchon;
    private String idUsuario;

    //private List<Movimiento>
}
