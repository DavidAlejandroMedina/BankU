package co.edu.usbcali.banku.dto;

import co.edu.usbcali.banku.domain.CuentaBancaria;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class FacturaServicioDTO {
    private String idFactura;
    private String nomEmpresa;
    private BigDecimal montoFactura;
    private String descripFactura;
    private String rupFactura;
    private Timestamp fechaFactura;
    private String idCuentaBancaria;
}
