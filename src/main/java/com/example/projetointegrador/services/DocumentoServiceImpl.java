package com.example.projetointegrador.services;

import com.example.projetointegrador.dto.DocumentoDTO;
import com.example.projetointegrador.exceptions.EntityNotFoundException;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.repositories.DocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    final DocumentoRepository documentoRepository;

    public DocumentoServiceImpl(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    @Override
    public List<Documento> listarDocumento() {
        return documentoRepository.findAll();
    }

    @Override
    public Documento editarDocumento(DocumentoDTO documentoDTO) {
        Documento documento1 = Documento.builder()
                .cnpj(documentoDTO.getCnpj())
                .cpf(documentoDTO.getCpf())
                .identidade(documentoDTO.getIdentidade())
                .build();
        return documentoRepository.save(documento1);
    }

    @Override
    public Documento salvarDocumento(DocumentoDTO documentoDTO) throws Exception {
        List<Documento> listaDeDocumento = documentoRepository.findAll();
        for (Documento valoresDocumento : listaDeDocumento) {
            if (documentoDTO.getCpf().equals(valoresDocumento.getCpf())) {
                throw new EntityNotFoundException("Esse cpf já esta cadastrado!");
            } else if (documentoDTO.getIdentidade().equals(valoresDocumento.getIdentidade())) {
                    throw new EntityNotFoundException("Essa identidade já esta cadastrada!");
                }
            }
        Documento documento1 = Documento.builder()
                .cnpj(documentoDTO.getCnpj())
                .cpf(documentoDTO.getCpf())
                .identidade(documentoDTO.getIdentidade())
                .build();
        return documentoRepository.save(documento1);
    }

    @Override
    public void deletarDocumento(Long id_documento) {
        documentoRepository.deleteById(id_documento);
    }
}
