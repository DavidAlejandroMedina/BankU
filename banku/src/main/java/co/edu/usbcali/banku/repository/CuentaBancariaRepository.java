package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.CuentaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaBancariaRepository extends JpaRepository<CuentaBancaria, String> {
}
