package com.jisho.bank_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/ola")
    public String dizerOla()
    {
        return "Olá, futuro Dev Senior em São Paulo";
    }
}
