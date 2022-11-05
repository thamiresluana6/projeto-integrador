package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Endereco;

import java.util.List;

public interface EnderecoService {
    List<Endereco> listarEndereco();

    Endereco editarEndereco(Endereco endereco);

    Endereco salvarEndereco(Endereco endereco);

    void deletarEndereco(Long id_endereco);
}
