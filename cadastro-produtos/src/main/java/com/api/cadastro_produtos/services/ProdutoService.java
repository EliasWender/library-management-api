package com.api.cadastro_produtos.services;

import com.api.cadastro_produtos.models.Produto;
import com.api.cadastro_produtos.repositorys.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;



import java.util.List;


@Service

public class ProdutoService {
    @Autowired
    private  ProdutoRepository repository;


public List<Produto> listar() {
    return repository.findAll();
}

public Produto atualizar(Long id, Produto produto) {
    Produto p = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado"));
    p.setNome(produto.getNome());
    p.setPreco(produto.getPreco());
    p.setQuantidade(produto.getQuantidade());
    return repository.save(produto);
}

public Produto buscar(Long id) {
    return repository.findById(id).orElseThrow();
}

public Produto salvar(Produto produto) {
    return repository.save(produto);


}
public void excluir(Long id) {
    repository.deleteById(id);
}






}
