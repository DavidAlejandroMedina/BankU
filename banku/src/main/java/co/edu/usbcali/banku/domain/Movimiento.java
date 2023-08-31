package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
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
@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @Column(nullable = false, length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimiento;

    @Column(nullable = false)
    private Date fechaMovimiento;

    @Column(nullable = false, length = 40)
    private String descripMovimiento;

    @Column(nullable = false, length = 7)
    private BigDecimal montoMovimiento;

    @ManyToOne
    @JoinColumn(name="idCuentaBancaria", referencedColumnName = "idCuentaBancaria", nullable = false)
    private CuentaBancaria cuentaBancaria;

}
