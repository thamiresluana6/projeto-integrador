package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServicempl {

    final PessoaRepository pessoaRepository;

    public PessoaServicempl(PessoaRepository pessoaRepository) {
        this.pessoaRepository= pessoaRepository;
    }
    public Pessoa salvarPessoa(Pessoa pessoa) {
        Pessoa pessoa1 = pessoaRepository.save(pessoa);
        return pessoa1;
    }

    public  List<Pessoa> buscarPessoa(){
      return pessoaRepository.findAll();
    }
}
