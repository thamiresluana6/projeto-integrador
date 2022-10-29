package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
@Data
@Table(name = "taxa" )
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxa")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "porcentagem")
    private Double porcentagem;


}

