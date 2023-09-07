package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.Soporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoporteRepository extends JpaRepository<Soporte, Integer> {
}
