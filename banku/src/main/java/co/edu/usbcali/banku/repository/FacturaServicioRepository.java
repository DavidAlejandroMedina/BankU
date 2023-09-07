package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.FacturaServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaServicioRepository extends JpaRepository<FacturaServicio, String> {
}
