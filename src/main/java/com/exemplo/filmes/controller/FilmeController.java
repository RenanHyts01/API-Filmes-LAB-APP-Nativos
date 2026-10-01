package com.exemplo.filmes.controller;

import com.exemplo.filmes.model.Filme;
import com.exemplo.filmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;

    @GetMapping
    public List<Filme> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Filme cadastrar(@RequestBody Filme filme) {
        return repository.save(filme);
    }
}
