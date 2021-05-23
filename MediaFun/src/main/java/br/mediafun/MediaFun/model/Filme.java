package br.mediafun.MediaFun.model;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Filme extends Item{
    private String diretor;
    private String elencoPrincipal;
    private String duracao;

    public Filme(String titulo, String diretor, String elenconPrincipal, String duracao, String url, String tipo){
        this.titulo = titulo;
        this.diretor = diretor;
        this.elencoPrincipal = elenconPrincipal;
        this.duracao = duracao;
        this.url = url;
        this.tipo = tipo;
        setDataCriacao(LocalDateTime.now());
    }

    public Filme() {

    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElencoPrincipal() {
        return elencoPrincipal;
    }

    public void setElencoPrincipal(String elencoPrincipal) {
        this.elencoPrincipal = elencoPrincipal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
