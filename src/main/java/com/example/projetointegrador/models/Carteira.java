package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "carteira")

public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carteira")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "saldo")
    private Double saldo;
    @Column(name = "dataInicioInvestimento")
    private LocalDate dataInicioInvestimento;
    @Column(name = "dataTerminoInvestimento")
    private LocalDate dataTerminoInvestimento;

}
