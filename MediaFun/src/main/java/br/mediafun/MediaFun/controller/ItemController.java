package br.mediafun.MediaFun.controller;

import br.mediafun.MediaFun.dto.RequisicaoNovaSerie;
import br.mediafun.MediaFun.dto.RequisicaoNovoFilme;
import br.mediafun.MediaFun.dto.RequisicaoNovoLivro;
import br.mediafun.MediaFun.model.Filme;
import br.mediafun.MediaFun.model.Livro;
import br.mediafun.MediaFun.model.Serie;
import br.mediafun.MediaFun.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("escolhaTipo")
    public String escolhaTipo(){
        return "item/escolhaTipo";
    }

    @GetMapping("formularioLivro")
    public String formularioLivro(RequisicaoNovoLivro requisicao){
        return "item/formularioLivro";
    }

    @GetMapping("formularioFilme")
    public String formularioFilme(RequisicaoNovoFilme requisicao){
        return "item/formularioFilme";
    }

    @GetMapping("formularioSerie")
    public String formularioSerie(RequisicaoNovaSerie requisicao){
        return "item/formularioSerie";
    }



    @PostMapping("novoLivro")
    public String novoLivro(@Valid RequisicaoNovoLivro requisicao, BindingResult result){
        if(result.hasErrors()){
            return "item/formularioLivro";
        }
        Livro livro = requisicao.toLivro();
        itemRepository.save(livro);
        return "item/escolhaTipo";
    }

    @PostMapping("novoFilme")
    public String novoFilme(@Valid RequisicaoNovoFilme requisicao, BindingResult result){
        if(result.hasErrors()){
            return "item/formularioFilme";
        }
        Filme filme = requisicao.toFilme();
        itemRepository.save(filme);
        return "item/escolhaTipo";
    }

    @PostMapping("novaSerie")
    public String novaSerie(@Valid RequisicaoNovaSerie requisicao, BindingResult result){
        if(result.hasErrors()){
            return "item/formularioSerie";
        }
        Serie serie = requisicao.toSerie();
        itemRepository.save(serie);
        return "item/escolhaTipo";
    }
}
