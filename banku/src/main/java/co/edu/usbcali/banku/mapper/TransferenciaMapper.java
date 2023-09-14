package co.edu.usbcali.banku.mapper;


import co.edu.usbcali.banku.domain.Transferencia;
import co.edu.usbcali.banku.dto.TransferenciaDTO;


import java.util.List;

public class TransferenciaMapper {
    public static Transferencia dtoToDomain(TransferenciaDTO transferenciaDTO){
        return Transferencia.builder()
                .idTransferencia(transferenciaDTO.getIdTransferencia())
                .fechaTransfe(transferenciaDTO.getFechaTransfe())
                .nomBancoDestinatario(transferenciaDTO.getNomBancoDestinatario())
                .idCuentaDestinatario(transferenciaDTO.getIdCuentaDestinatario())
                .idDestinatario(transferenciaDTO.getIdDestinatario())
                .montoEnviado(transferenciaDTO.getMontoEnviado())
                .descripTransfe(transferenciaDTO.getDescripTransfe())
                .cuentaBancaria(transferenciaDTO.getIdCuentaBancaria())
                .build();
    }

    public static TransferenciaDTO domainToDTO(Transferencia transferencia){
        return TransferenciaDTO.builder()
                .idTransferencia(transferencia.getIdTransferencia())
                .fechaTransfe(transferencia.getFechaTransfe())
                .nomBancoDestinatario(transferencia.getNomBancoDestinatario())
                .idCuentaDestinatario(transferencia.getIdCuentaDestinatario())
                .idDestinatario(transferencia.getIdDestinatario())
                .montoEnviado(transferencia.getMontoEnviado())
                .descripTransfe(transferencia.getDescripTransfe())
                .idCuentaBancaria(transferencia.getCuentaBancaria())
                .build();
    }

    public List<Transferencia> dtoToDomainList(List<TransferenciaDTO> transferenciaDTO){
        return transferenciaDTO.stream().map(TransferenciaMapper::dtoToDomain).toList();
    }

    public List<TransferenciaDTO> domainToDtoList(List<Transferencia> transferencia){
        return transferencia.stream().map(TransferenciaMapper::domainToDTO).toList();
    }

}
