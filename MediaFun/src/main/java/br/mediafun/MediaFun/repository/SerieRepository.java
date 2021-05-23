package br.mediafun.MediaFun.repository;

import br.mediafun.MediaFun.model.Item;
import br.mediafun.MediaFun.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Serie, Long> {
}
