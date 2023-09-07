package co.edu.usbcali.banku.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovimientoDTO {
    private Integer idMovimiento;
    private Date fechaMovimiento;
    private String descripMovimiento;
    private BigDecimal montoMovimiento;
    private String idCuentaBancaria;
}
