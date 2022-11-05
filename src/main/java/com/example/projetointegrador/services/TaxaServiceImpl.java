package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Taxa;
import com.example.projetointegrador.repositories.PessoaRepository;
import com.example.projetointegrador.repositories.TaxaRepository;
import org.springframework.stereotype.Service;

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
    public Taxa editarTaxa(Taxa taxa) {
        return taxaRepository.save(taxa);
    }

    @Override
    public Taxa salvarTaxa(Taxa taxa) {
        return taxaRepository.save(taxa);
    }

    @Override
    public void deletarTaxa(Long id_taxa) {
        taxaRepository.deleteById(id_taxa);
    }
}
