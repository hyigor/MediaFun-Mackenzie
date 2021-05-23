package br.mediafun.MediaFun.controller;

import br.mediafun.MediaFun.model.Filme;
import br.mediafun.MediaFun.model.Item;
import br.mediafun.MediaFun.model.Livro;
import br.mediafun.MediaFun.model.Serie;
import br.mediafun.MediaFun.repository.FilmeRepository;
import br.mediafun.MediaFun.repository.ItemRepository;
import br.mediafun.MediaFun.repository.LivroRepository;
import br.mediafun.MediaFun.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private SerieRepository serieRepository;
    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping("/home")
    public String home(Model model){
        List<Item> itens = itemRepository.findAll();
        model.addAttribute("itens", itens);
        return "home";
    }

    @GetMapping("/filmes")
    public String filmes(Model model){
        List<Filme> filmes = filmeRepository.findAll();
        model.addAttribute("filmes", filmes);
        return "filmes";
    }

    @GetMapping("/series")
    public String series(Model model){
        List<Serie> series = serieRepository.findAll();
        model.addAttribute("series", series);
        return "series";
    }

    @GetMapping("/livros")
    public String livros(Model model){
        List<Livro> livros = livroRepository.findAll();
        model.addAttribute("livros", livros);
        return "livros";
    }

}
