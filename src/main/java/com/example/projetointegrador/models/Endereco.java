package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name ="endereco" )
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String logradouro;
    private String numeroCasa;
    private String referencia;
}
