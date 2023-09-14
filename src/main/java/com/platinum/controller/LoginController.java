package com.platinum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.platinum.model.Usuario;
import com.platinum.model.Persona;
import com.platinum.repository.UsuarioRepository;
import com.platinum.repository.PersonaRepository;

@RestController
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @ @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        Usuario foundUser = usuarioRepository.findByUsername(usuario.getUsername());
        if (foundUser != null && passwordEncoder.matches(usuario.getPassword(), foundUser.getPassword())) {
            return "Inicio de sesión exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }
}

