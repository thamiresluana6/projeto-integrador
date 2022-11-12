package com.example.projetointegrador.services;

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
    public Endereco editarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco salvarEndereco(Endereco endereco) throws Exception {
        List<Endereco> enderecoLista = enderecoRepository.findAll();
        for (Endereco numCasa1: enderecoLista) {
         if (endereco.getNumeroCasa().equals(numCasa1.getNumeroCasa())) {
             throw new Exception ("Este número já esta cadastrado, tente outro!");
         }
        }
        return enderecoRepository.save(endereco);
    }

    @Override
    public void deletarEndereco(Long id_endereco) {
        enderecoRepository.deleteById(id_endereco);
    }



}
