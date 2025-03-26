package com.sistema.fatura.exercicio.service;

import com.sistema.fatura.exercicio.model.Fatura;
import org.springframework.stereotype.Service;
import com.sistema.fatura.exercicio.repository.FaturaRepository;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> listarTodasFaturas() {
        return faturaRepository.findAll();
    }

    public Fatura salvarFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}
