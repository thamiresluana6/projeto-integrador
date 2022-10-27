package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "documento")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "identidade")
    private String identidade;

}
