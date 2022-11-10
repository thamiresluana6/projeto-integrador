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
        List<Carteira> CadastroCarteira = carteiraRepository.findAll();
        if (carteira.getNome() != null && CadastroCarteira.get(3).getNome().equals(carteira.getNome())) {
            throw new Exception("Nome de carteita ja existente,tente outro!");
        }else{
            return carteiraRepository.save(carteira);
        }
    }

    @Override
    public void deletarCarteira(Long id_carteira) {
        carteiraRepository.deleteById(id_carteira);
    }

    }
