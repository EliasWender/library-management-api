package com.api.cadastro_produtos.controllers;

import com.api.cadastro_produtos.models.Produto;
import com.api.cadastro_produtos.services.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    //Endpoint de
    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }
    @PostMapping("/produtos")



    public Produto criarProduto(@RequestBody @Valid Produto produto) {
        service.salvar(produto);
        return produto;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar (@PathVariable Long id,
                             @RequestBody @Valid Produto produto) {

        Produto produtoAtualizado = service.atualizar(id, produto);

        return ResponseEntity.ok(produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}


