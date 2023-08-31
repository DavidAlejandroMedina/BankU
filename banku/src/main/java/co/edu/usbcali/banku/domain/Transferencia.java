package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "transferencia")
public class Transferencia {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransferencia;

    @Column(nullable = false)
    private Timestamp fechaTransfe;

    @Column(nullable = false, length = 15)
    private String nomBanco;

    @Column(nullable = false, length = 20)
    private String idCuentaDestinatario;

    @Column(nullable = false, length = 15)
    private String idDestinatario;

    @Column(nullable = false, length = 7)
    private BigDecimal montoEnviado;

    @Column(length = 20)
    private String descripTransfe;

    @ManyToOne
    @JoinColumn(name = "idCuentaBancaria", referencedColumnName = "idCuentaBancaria", nullable = false)
    private CuentaBancaria cuentaBancaria;

}


