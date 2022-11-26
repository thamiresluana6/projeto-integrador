package com.example.projetointegrador.services;


import com.example.projetointegrador.dto.TaxaDTO;
import com.example.projetointegrador.models.Taxa;

import java.util.List;

public interface TaxaService {
    List<Taxa> listarTaxa();

    Taxa editarTaxa(TaxaDTO taxaDTO);

    Taxa salvarTaxa(TaxaDTO taxaDTO) throws Exception;

    void deletarTaxa(Long id_taxa);
}
