package com.example.projetointegrador.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class TaxaDTO {
    private Long id_taxa;
    private String nome;
    private Double porcentagem;
}
