package com.queiroz.Gerenciamento_Autores.controllers;

import com.queiroz.Gerenciamento_Autores.models.AutorModel;
import com.queiroz.Gerenciamento_Autores.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorModel> criar(AutorModel autorModel) {
        return ResponseEntity.status(201).body(autorService.criar(autorModel));
    }

    @GetMapping
    public ResponseEntity<List<AutorModel>> listar() {
        return ResponseEntity.ok().body(autorService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorModel> buscar(@PathVariable Long id) {
        Optional<AutorModel> livro = autorService.buscar(id);

        if (livro.isPresent())
            return ResponseEntity.ok().body(livro.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AutorModel> deletar(@PathVariable Long id) {
        autorService.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
