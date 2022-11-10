package com.example.projetointegrador.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class CarteiraDTO {
    private Long id_carteira;
    private String nome;
    private Double saldo;
    private LocalDate dataInicioInvestimento;
    private LocalDate dataTerminoInvestimento;

    }
