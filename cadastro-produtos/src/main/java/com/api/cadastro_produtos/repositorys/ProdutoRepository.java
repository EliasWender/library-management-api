package com.api.cadastro_produtos.repositorys;

import com.api.cadastro_produtos.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}



