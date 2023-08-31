package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
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
@Table(name = "factura")
public class Factura {
    @Id
    @Column(nullable = false, length = 20)
    private String idFactura;

    @Column(nullable = false, length = 20)
    private String nomEmpresa;

    @Column(nullable = false, length = 7)
    private BigDecimal montoFactura;

    @Column(nullable = false, length = 20)
    private String descripFactura;

    @Column(nullable = false, length = 20)
    private String rupFactura;

    @Column(nullable = false)
    private Timestamp fechaFactura;

    @ManyToOne
    @JoinColumn(name="idCuentaBancaria", referencedColumnName = "idCuentaBancaria", nullable = false)
    private CuentaBancaria cuentaBancaria;
}
