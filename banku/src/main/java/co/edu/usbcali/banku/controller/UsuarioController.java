package co.edu.usbcali.banku.controller;

import co.edu.usbcali.banku.domain.Usuario;
import co.edu.usbcali.banku.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @GetMapping("/validar")
    public String validarController(){
        return "Controlador correcto";
    }

    @GetMapping("/obtenerTodos")
    public List<Usuario> obtenerTodos(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
