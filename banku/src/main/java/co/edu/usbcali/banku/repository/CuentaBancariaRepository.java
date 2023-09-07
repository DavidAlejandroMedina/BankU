package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.CuentaBancaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaBancariaRepository extends JpaRepository<CuentaBancaria, String> {
}
