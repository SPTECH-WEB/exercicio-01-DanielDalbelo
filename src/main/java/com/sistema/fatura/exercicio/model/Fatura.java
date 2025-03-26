package com.sistema.fatura.exercicio.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
@Table()
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Deve informar o número de cartão de crédito")
    @Pattern(regexp = "\\d{16}", message = "O número de cartão de crédito deve ter exatamente 16 dígitos")
    private String numeroCartao;

    @NotBlank(message="O nome não pode estar vazio")
    @Size(min = 3, max = 100, message = "O nome do titular deve estar entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.0", message = "O valor não pode ser menor do que R$10,00")
    @DecimalMax(value = "5000.0", message = "O valor não pode exceder R$5000,00")
    private Double valor;

    @NotNull(message = "A data de pagamento não pode ser nula")
    @FutureOrPresent(message = "A data de pagamento não pode ser uma data passada")
    private LocalDate dataPagamento;

    @NotBlank(message = "O email para contato não pode estar em branco")
    @Email(message = "O Email inserido não é válido")
    private String emailContato;

    public Fatura() {
    }

    public Fatura(Long id, String numeroCartao, String nomeTitular, Double valor, LocalDate dataPagamento, String emailContato) {
        this.id = id;
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.emailContato = emailContato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}
