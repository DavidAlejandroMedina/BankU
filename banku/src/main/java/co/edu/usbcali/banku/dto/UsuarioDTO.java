package co.edu.usbcali.banku.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer clave;
}
