package co.edu.usbcali.banku.repository;

import co.edu.usbcali.banku.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
