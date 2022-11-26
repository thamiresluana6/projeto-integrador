package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.EnderecoDTO;
import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Endereco;
import com.example.projetointegrador.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    final EnderecoRepository enderecoRepository;

    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public List<Endereco> listarEndereco() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco editarEndereco(EnderecoDTO enderecoDTO) {
        Endereco endereco2 = Endereco.builder()
                .cep(enderecoDTO.getCep())
                .referencia(enderecoDTO.getReferencia())
                .numeroCasa(enderecoDTO.getNumeroCasa())
                .logradouro(enderecoDTO.getLogradouro())
                .build();
        return enderecoRepository.save(endereco2);
    }

    @Override
    public Endereco salvarEndereco(EnderecoDTO enderecoDTO) throws Exception {
        List<Endereco> enderecoLista = enderecoRepository.findAll();
        for (Endereco numCasa1: enderecoLista) {
         if (enderecoDTO.getNumeroCasa().equals(numCasa1.getNumeroCasa())) {
             throw new EntityNotFoundException("Este número já esta cadastrado, tente outro!");
         }
        }
        Endereco endereco1 = Endereco.builder()
                .logradouro(enderecoDTO.getLogradouro())
                .numeroCasa(enderecoDTO.getNumeroCasa())
                .referencia(enderecoDTO.getReferencia())
                .cep(enderecoDTO.getCep())
                .build();
        return enderecoRepository.save(endereco1);
    }

    @Override
    public void deletarEndereco(Long id_endereco) {
        enderecoRepository.deleteById(id_endereco);
    }



}
