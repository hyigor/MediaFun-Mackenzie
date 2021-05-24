package br.mediafun.MediaFun.repository;

import br.mediafun.MediaFun.model.Avaliacao;
import br.mediafun.MediaFun.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
