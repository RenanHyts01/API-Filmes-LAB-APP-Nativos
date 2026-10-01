package com.exemplo.filmes.config;

import com.exemplo.filmes.model.Filme;
import com.exemplo.filmes.repository.FilmeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarregarDados {
    @Bean
    CommandLineRunner iniciarBanco(FilmeRepository repository) {
        return args -> {
            repository.save(new Filme("O Senhor dos Anéis: O Retorno do Rei", "Fantasia", 2003));
            repository.save(new Filme("Matrix", "Ficção Científica", 1999));
            repository.save(new Filme("O Auto da Compadecida", "Comédia", 2000));
        };
    }
}
