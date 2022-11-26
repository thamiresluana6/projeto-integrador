package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.CarteiraDTO;
import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.repositories.CarteiraRepository;
import org.hibernate.sql.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraServiceImpl implements CarteiraService {

    final CarteiraRepository carteiraRepository;

    public CarteiraServiceImpl(CarteiraRepository carteiraRepository) {
        this.carteiraRepository = carteiraRepository;
    }

    @Override
    public List<Carteira> listarCarteira() {
        return carteiraRepository.findAll();
    }

    @Override
    public Carteira editarCarteira(CarteiraDTO carteiraDTO) {
        Carteira carteira2 = Carteira.builder()
                .nome(carteiraDTO.getNome())
                .saldo(carteiraDTO.getSaldo())
                .dataInicioInvestimento(carteiraDTO.getDataInicioInvestimento())
                .dataTerminoInvestimento(carteiraDTO.getDataTerminoInvestimento())
                .build();
        return carteiraRepository.save(carteira2);
    }

    @Override
    public Carteira salvarCarteira(CarteiraDTO carteiraDTO) throws Exception {
        List<Carteira> carteiraList= carteiraRepository.findAll();
        for (Carteira carteira1: carteiraList) {
            if (carteiraDTO.getNome().equals(carteira1.getNome())) {
                throw new EntityNotFoundException("Esse nome de carteira ja existe, tente outro!");
            }
        }
        Carteira carteira1 = Carteira.builder()
                .nome(carteiraDTO.getNome())
                .saldo(carteiraDTO.getSaldo())
                .dataInicioInvestimento(carteiraDTO.getDataInicioInvestimento())
                .dataTerminoInvestimento(carteiraDTO.getDataTerminoInvestimento())
                .build();
        return carteiraRepository.save(carteira1);
    }

    @Override
    public void deletarCarteira(Long id_carteira) {
        carteiraRepository.deleteById(id_carteira);
    }

    }
