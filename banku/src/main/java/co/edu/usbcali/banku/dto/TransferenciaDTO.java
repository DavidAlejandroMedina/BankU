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
