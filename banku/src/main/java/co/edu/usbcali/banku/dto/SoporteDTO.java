package co.edu.usbcali.banku.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SoporteDTO {
    private Integer idSoporte;
    private String tipoSoporte;
    private String descripSoporte;
    private Boolean estadoSoporte;
    private String idUsuario;
}
