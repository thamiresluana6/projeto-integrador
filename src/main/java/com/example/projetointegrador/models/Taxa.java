package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode(of = "id_taxa")
@Table(name = "taxa" )
public class Taxa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxa")
    private Long id_taxa;
    @Column(name = "nome")
    private String nome;
    @Column(name = "porcentagem")
    private Double porcentagem;


}

