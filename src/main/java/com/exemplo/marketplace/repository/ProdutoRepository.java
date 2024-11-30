
package com.exemplo.marketplace.repository;

import com.exemplo.marketplace.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
