package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.TaxaDTO;
import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.repositories.TaxaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TaxaServiceImpl implements TaxaService {

    final TaxaRepository taxaRepository;

    public TaxaServiceImpl(TaxaRepository taxaRepository) {
        this.taxaRepository = taxaRepository;
    }

    @Override
    public List<Taxa> listarTaxa() {
        return taxaRepository.findAll();
    }

    @Override
    public Taxa editarTaxa(TaxaDTO taxaDTO) {
        Taxa taxa2 = Taxa.builder()
                .nome(taxaDTO.getNome())
                .porcentagem(taxaDTO.getPorcentagem() != null ? taxaDTO.getPorcentagem() : null)
                .build();
        return taxaRepository.save(taxa2);
    }

    @Override
    public Taxa salvarTaxa(TaxaDTO taxaDTO) throws Exception {
        List <Taxa> taxaLista = taxaRepository.findAll();
        for (Taxa nomeTaxa1: taxaLista) {

            if (taxaDTO.getNome().equals(nomeTaxa1.getNome()));{
                throw new EntityNotFoundException("Esse nome de taxa ja está cadastrado,tente outro!");
            }
        }
                Taxa taxa1 = Taxa.builder()
                        .nome(taxaDTO.getNome())
                        .porcentagem(taxaDTO.getPorcentagem() != null ? taxaDTO.getPorcentagem() : null)
                        .build();

        return taxaRepository.save(taxa1);
    }

    @Override
    public void deletarTaxa(Long id_taxa) {
        taxaRepository.deleteById(id_taxa);
    }
}
