package com.sistema.fatura.exercicio.controller;


import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sistema.fatura.exercicio.service.FaturaService;
import com.sistema.fatura.exercicio.model.Fatura;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {

    private final FaturaService faturaService;
    public FaturaController(FaturaService faturaService) {this.faturaService = faturaService;}

    @GetMapping
    public List<Fatura> listarFaturas() {
        return faturaService.listarTodasFaturas();
    }

    @PostMapping
    public ResponseEntity<Fatura> criarFatura(@Valid @RequestBody Fatura fatura) {
        Fatura novaFatura = faturaService.salvarFatura(fatura);
        return ResponseEntity.ok(novaFatura);
    }
}
