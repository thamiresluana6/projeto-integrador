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
@Table (name = "pessoa")

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "genero")
    private String genero;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "rendimentoMensal")
    private Double rendimentoMensal;
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @Column(name = "dependentes")
    private String dependentes;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "documento_pessoa",
            joinColumns= @JoinColumn(name = "id_documento"),
            inverseJoinColumns = @JoinColumn(name = "id_pessoa"))
    private Documento documento;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "pessoa_endereço",
        joinColumns= @JoinColumn(name = "id_endereço"),
        inverseJoinColumns = @JoinColumn(name = "id_pessoa"))
    private Endereco endereco;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinTable(name = "pessoa_carteira",
            joinColumns= @JoinColumn(name = "id_carteira"),
            inverseJoinColumns = @JoinColumn(name = "id_pessoa"))
    private Carteira carteira;

}
