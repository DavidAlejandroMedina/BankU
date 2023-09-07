package co.edu.usbcali.banku.dto;

import co.edu.usbcali.banku.domain.CuentaBancaria;

import java.math.BigDecimal;
import java.sql.Date;

public class MovimientoDTO {
    private Integer idMovimiento;
    private Date fechaMovimiento;
    private String descripMovimiento;
    private BigDecimal montoMovimiento;
    private String idCuentaBancaria;
}
