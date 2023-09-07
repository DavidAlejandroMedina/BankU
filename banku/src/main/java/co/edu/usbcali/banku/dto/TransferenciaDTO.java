package co.edu.usbcali.banku.dto;

import co.edu.usbcali.banku.domain.CuentaBancaria;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TransferenciaDTO {
    private Integer idTransferencia;
    private Timestamp fechaTransfe;
    private String nomBancoDestinatario;
    private String idCuentaDestinatario;
    private String idDestinatario;
    private BigDecimal montoEnviado;
    private String descripTransfe;
    private String idCuentaBancaria;
}
