package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;

import java.util.List;

public interface CarteiraService {
        List<Carteira> listarCarteira();

        Carteira salvarCarteira(Carteira carteira) throws Exception;

        Carteira editarCarteira(Carteira carteira);

        void deletarCarteira(Long id_carteira);


}
