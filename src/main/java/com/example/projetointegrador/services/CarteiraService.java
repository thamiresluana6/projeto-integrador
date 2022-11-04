package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Carteira;

import java.util.List;

public interface CarteiraService {
        List<Carteira> listarCarteira();

        Carteira salvarCarteira(Carteira carteira);

        Carteira editarCarteira(Carteira carteira);


}