package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.CarteiraDTO;
import com.example.projetointegrador.models.Carteira;

import java.util.List;

public interface CarteiraService {
        List<Carteira> listarCarteira();

        Carteira salvarCarteira(CarteiraDTO carteiraDTO) throws Exception;

        Carteira editarCarteira(CarteiraDTO carteiraDTO);

        void deletarCarteira(Long id_carteira);


}
