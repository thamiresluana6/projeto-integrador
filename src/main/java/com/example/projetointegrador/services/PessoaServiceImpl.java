package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    final PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa editar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public Pessoa salvar(Pessoa pessoa) throws Exception {
        List<Pessoa> listaDePessoa = pessoaRepository.findAll();
        for (Pessoa valorespessoa : listaDePessoa) {
            if (pessoa.getNome().equals(valorespessoa.getNome())) {
                throw new Exception("Esse nome já esta cadastrado, tente outro!");
            } if (pessoa.getDocumento().getCpf().equals(valorespessoa.getDocumento().getCpf())){
                throw new Exception("Esse cpf já esta cadastrado, tente outro!");
            } if (pessoa.getDocumento().getIdentidade().equals(valorespessoa.getDocumento().getIdentidade())){
                throw new Exception("Essa identidade já esta cadastrado, tente outra!");
            } if (pessoa.getEndereco().getNumeroCasa().equals(valorespessoa.getEndereco().getNumeroCasa())){
                throw new Exception("Esse numero já esta cadastrado, tente outro!");
            }
        }
            return pessoaRepository.save(pessoa);
        }

    @Override
    public void deletar(Long id_pessoa) {
        pessoaRepository.deleteById(id_pessoa);
    }

    }

