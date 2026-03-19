package com.queiroz.Gerenciamento_Autores.controllers;

import com.queiroz.Gerenciamento_Autores.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;
}
