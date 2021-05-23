package br.mediafun.MediaFun.repository;

import br.mediafun.MediaFun.model.Item;
import br.mediafun.MediaFun.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
