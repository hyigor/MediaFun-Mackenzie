package br.mediafun.MediaFun.repository;

import br.mediafun.MediaFun.model.Filme;
import br.mediafun.MediaFun.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
