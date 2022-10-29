package com.example.projetointegrador.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
public class EnderecoDTO {
    private String logradouro;
    private String numeroCasa;
    private String referencia;
}

