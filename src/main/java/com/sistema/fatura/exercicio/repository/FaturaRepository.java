package com.sistema.fatura.exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema.fatura.exercicio.model.Fatura;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

}
