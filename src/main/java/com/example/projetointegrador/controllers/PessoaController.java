package controllers;

import dto.PessoaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class PessoaController {

    @PostMapping(value = "/salvarPessoa")
    public ResponseEntity<Object> salvarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        System.out.println(pessoaDTO);
        return null;
    }
}
