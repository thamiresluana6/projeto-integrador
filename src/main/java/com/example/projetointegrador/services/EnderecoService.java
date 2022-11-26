package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.EnderecoDTO;
import com.example.projetointegrador.models.Endereco;

import java.util.List;

public interface EnderecoService {
    List<Endereco> listarEndereco();

    Endereco editarEndereco(EnderecoDTO enderecoDTO);

    Endereco salvarEndereco(EnderecoDTO enderecoDTO) throws Exception;

    void deletarEndereco(Long id_endereco);
}
