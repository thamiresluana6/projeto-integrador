package com.example.projetointegrador.services;

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
    public Carteira editarCarteira(Carteira carteira) {
        return carteiraRepository.save(carteira);
    }

    @Override
    public Carteira salvarCarteira(Carteira carteira) throws Exception {
        List<Carteira> carteiraList= carteiraRepository.findAll();
        for (Carteira carteira1: carteiraList) {
            if (carteira.getNome().equals(carteira1.getNome())) {
                throw new Exception("Esse nome de carteira ja existe, tente outro!");
            }
        }
        return carteiraRepository.save(carteira);
    }

    @Override
    public void deletarCarteira(Long id_carteira) {
        carteiraRepository.deleteById(id_carteira);
    }

    }
