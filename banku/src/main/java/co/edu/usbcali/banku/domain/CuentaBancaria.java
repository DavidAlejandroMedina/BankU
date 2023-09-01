package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuentaBancaria")
public class CuentaBancaria {
    @Id
    @Column(nullable = false, length = 20)
    private String idCuentaBancaria;

    @Column(nullable = false, length = 7, columnDefinition = "0")
    private BigDecimal saldoDisponible;

    @Column(nullable = false, length = 6)
    private Integer codigoRetiro;

    @Column(nullable = false, length = 7)
    private BigDecimal saldoColchon;

    @OneToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "cuentaBancaria", cascade = CascadeType.ALL)
    private List<Movimiento> movimientos;
}
