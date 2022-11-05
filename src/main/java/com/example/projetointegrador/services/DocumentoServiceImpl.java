package com.example.projetointegrador.services;

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
    public Documento editarDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public Documento salvarDocumento(Documento documento) {
        return documentoRepository.save(documento);
    }

    @Override
    public void deletarDocumento(Long id_documento) {
        documentoRepository.deleteById(id_documento);
    }
}
