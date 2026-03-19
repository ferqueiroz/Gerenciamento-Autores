package com.queiroz.Gerenciamento_Autores.services;

import com.queiroz.Gerenciamento_Autores.models.AutorModel;
import com.queiroz.Gerenciamento_Autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public AutorModel criar(AutorModel autorModel) {
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> listar() {
        return autorRepository.findAll();
    }

    public Optional<AutorModel> buscar(Long id) {
        return autorRepository.findById(id);
    }

    public void excluir(Long id) {
        autorRepository.deleteById(id);
    }
}
