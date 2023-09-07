package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {
}
