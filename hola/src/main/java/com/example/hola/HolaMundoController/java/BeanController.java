package com.example.hola.HolaMundoController.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class BeanController {

        private final String mensaje;

        public BeanController(String mensajePersonalizado) {
            this.mensaje = mensajePersonalizado;
        }

        @GetMapping("/bean")
        public String mostrarBean() {
            return mensaje;
        }
    }


