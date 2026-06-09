package com.demo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pessoa")
public class PessoaController {

    PessoaRepository repo;

    public PessoaController(PessoaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Pessoa criar(Pessoa pessoa) {
        return repo.save(pessoa);
    }

    @GetMapping("/tudo")
    public List<Pessoa> retornarTodas() {
        return repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @GetMapping("{id}")
    public Pessoa retornarPorId(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("{id}")
    public Pessoa editar(@PathVariable Long id, @RequestBody String nome) {
        Pessoa pessoa = repo.findById(id).orElseThrow();

        pessoa.setNome(nome);
        repo.save(pessoa);

        return pessoa;
    }

    @DeleteMapping("{id}")
    public void remover(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @DeleteMapping
    public void removerTodos() {
        repo.deleteAll();
    }

}
