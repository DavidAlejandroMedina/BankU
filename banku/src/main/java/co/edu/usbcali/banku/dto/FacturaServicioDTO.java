package co.edu.usbcali.banku.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FacturaServicioDTO {
    private String idFactura;
    private String nomEmpresa;
    private BigDecimal montoFactura;
    private String descripFactura;
    private String rupFactura;
    private Timestamp fechaFactura;
    private String idCuentaBancaria;
}
