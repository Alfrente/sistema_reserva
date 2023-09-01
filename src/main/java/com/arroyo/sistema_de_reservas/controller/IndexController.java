package com.arroyo.sistema_de_reservas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("titulo", "Sistema de reserva");
        model.addAttribute("body", "Simulación de Sistema de reserva en linea");

        return "index";
    }
}
