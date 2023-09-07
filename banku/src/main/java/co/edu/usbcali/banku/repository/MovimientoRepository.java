package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
}
