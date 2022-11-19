package com.example.projetointegrador.services;

import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Taxa;
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
    public Taxa salvarTaxa(Taxa taxa) throws Exception {
        List <Taxa> taxaLista = taxaRepository.findAll();
        for (Taxa nomeTaxa1: taxaLista) {
            if (taxa.getNome().equals(nomeTaxa1.getNome()));{
                throw new EntityNotFoundException("Esse nome de taxa ja está cadastrado,tente outro!");
            }
        }
        return taxaRepository.save(taxa);
    }

    @Override
    public void deletarTaxa(Long id_taxa) {
        taxaRepository.deleteById(id_taxa);
    }
}
