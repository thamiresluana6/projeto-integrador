package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.services.CarteiraServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class CarteiraController {
    final CarteiraServiceImpl carteiraServiceImpl;

    public CarteiraController(CarteiraServiceImpl carteiraService) {
        this.carteiraServiceImpl = carteiraService;
    }

    @PostMapping(value = "/salvarCarteira")
    public ResponseEntity<Object> salvarCarteira(@RequestBody Carteira carteira) throws Exception {
        Carteira response = carteiraServiceImpl.salvarCarteira(carteira);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping(value = "/buscarCarteira")
    public ResponseEntity<Object> buscarCarteira() {
        List<Carteira> response = carteiraServiceImpl.listarCarteira();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/alterarCarteira")
    public ResponseEntity<Object> alterarCarteira(@RequestBody Carteira carteira) {
        Carteira response = carteiraServiceImpl.editarCarteira(carteira);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping(value = "/deletarCarteira")
    public ResponseEntity<Object>deletarCarteira(Long id_carteira) {
        carteiraServiceImpl.deletarCarteira(id_carteira);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
