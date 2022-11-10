package com.example.projetointegrador.dto;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Endereco;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class PessoaDTO {

    private Long id_pessoa;
    private String nome;
    private Documento documento;
    private Endereco endereco;
    private String genero;
    private Integer idade;
    private Double rendimentoMensal;
    private String estadoCivil;
    private String dependentes;
    private Carteira carteira;
}
