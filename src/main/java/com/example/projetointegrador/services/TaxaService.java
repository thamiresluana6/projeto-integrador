package com.example.projetointegrador.services;


import com.example.projetointegrador.models.Taxa;

import java.util.List;

public interface TaxaService {
    List<Taxa> listarTaxa();

    Taxa editarTaxa(Taxa taxa);

    Taxa salvarTaxa(Taxa taxa);

    void deletarTaxa(Long id_taxa);
}
