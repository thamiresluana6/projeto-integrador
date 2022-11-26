package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.DocumentoDTO;
import com.example.projetointegrador.dto.PessoaDTO;
import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Pessoa;
import com.example.projetointegrador.repositories.PessoaRepository;
import com.example.projetointegrador.repositories.TaxaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    final PessoaRepository pessoaRepository;

    final TaxaRepository taxaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository, TaxaRepository taxaRepository) {
        this.pessoaRepository = pessoaRepository;
        this.taxaRepository = taxaRepository;
    }

    @Override
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa editar(PessoaDTO pessoaDTO) {
        Pessoa pessoa2 = Pessoa.builder()
                .nome(pessoaDTO.getNome())
                .dependentes(pessoaDTO.getDependentes())
                .idade(pessoaDTO.getIdade())
                .estadoCivil(pessoaDTO.getEstadoCivil())
                .genero(pessoaDTO.getGenero())
                .rendimentoMensal(pessoaDTO.getRendimentoMensal())
                .documento(pessoaDTO.getDocumento())
                .endereco(pessoaDTO.getEndereco())
                .taxa(pessoaDTO.getTaxa())
                .carteira(pessoaDTO.getCarteira())
                .build();
        return pessoaRepository.save(pessoa2);
    }

    @Override
    public Pessoa salvar(PessoaDTO pessoaDTO) throws Exception {
        List<Pessoa> listaDePessoa = pessoaRepository.findAll();
        for (Pessoa valorespessoa : listaDePessoa) {
            if (pessoaDTO.getNome().equals(valorespessoa.getNome())) {
                throw new EntityNotFoundException("Esse nome já esta cadastrado, tente outro!");
            }
            if (pessoaDTO.getDocumento().getCpf().equals(valorespessoa.getDocumento().getCpf())) {
                throw new EntityNotFoundException("Esse cpf já esta cadastrado, tente outro!");
            }
            if (pessoaDTO.getDocumento().getIdentidade().equals(valorespessoa.getDocumento().getIdentidade())) {
                throw new EntityNotFoundException("Essa identidade já esta cadastrado, tente outra!");
            }
            if (pessoaDTO.getEndereco().getNumeroCasa().equals(valorespessoa.getEndereco().getNumeroCasa())) {
                throw new EntityNotFoundException("Esse numero já esta cadastrado, tente outro!");
            }
        }
        Pessoa pessoa1 = Pessoa.builder()
                .nome(pessoaDTO.getNome())
                .dependentes(pessoaDTO.getDependentes())
                .idade(pessoaDTO.getIdade())
                .estadoCivil(pessoaDTO.getEstadoCivil())
                .genero(pessoaDTO.getGenero())
                .rendimentoMensal(pessoaDTO.getRendimentoMensal())
                .documento(pessoaDTO.getDocumento())
                .endereco(pessoaDTO.getEndereco())
                .taxa(pessoaDTO.getTaxa())
                .carteira(pessoaDTO.getCarteira())
                .build();
        return pessoaRepository.save(pessoa1);
    }

    @Override
    public void deletar(Long id_pessoa) {
        pessoaRepository.deleteById(id_pessoa);
    }


    public void adicionarTaxa() {
        List<Pessoa> taxaList = pessoaRepository.findAll();
                for (Pessoa pessoa2 : taxaList) {
                    if (pessoa2.getCarteira().getSaldo() != null && pessoa2.getTaxa() != null && pessoa2.getTaxa().getPorcentagem() != null) {
                        Double saldoAtual = pessoa2.getCarteira().getSaldo();
                        Double juros = pessoa2.getTaxa().getPorcentagem();
                        Double rendimento = saldoAtual + (saldoAtual * (juros / 1000));
                        pessoa2.getCarteira().setSaldo(rendimento);
                        pessoaRepository.save(pessoa2);
                    }
                }
            }

        }

