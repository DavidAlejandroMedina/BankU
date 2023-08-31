package co.edu.usbcali.banku.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(nullable = false, length = 15)
    private String idUsuario;

    @Column(nullable = false, length = 20)
    private String nombre;

    @Column(nullable = false, length = 30)
    private String apellido;

    @Column(nullable = false, length = 100)
    private String correo;

    @Column(nullable = false, length = 4)
    private Integer clave;
}
