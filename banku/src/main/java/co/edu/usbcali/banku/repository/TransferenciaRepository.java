package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer> {
}
