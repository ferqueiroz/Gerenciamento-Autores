package com.queiroz.Gerenciamento_Autores.services;

import com.queiroz.Gerenciamento_Autores.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;
}
