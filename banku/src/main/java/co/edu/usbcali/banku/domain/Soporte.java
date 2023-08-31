package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "soporte")
public class Soporte {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSoporte;

    @Column(nullable = false, length = 10)
    private String tipoSoporte;

    @Column(nullable = false, length = 100)
    private String descripSoporte;

    @Column(nullable = false)
    private Boolean estadoSoporte;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", nullable = false)
    private Usuario usuario;
}
