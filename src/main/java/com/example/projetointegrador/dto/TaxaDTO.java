package com.example.projetointegrador.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class TaxaDTO {
    private String nome;
    private Double porcentagem;
}
