package br.mediafun.MediaFun.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Livro extends Item{

    private String autor;
    private String editora;

    public Livro(String titulo, String autor, String editora, String url, String tipo){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.url = url;
        this.tipo = tipo;
        setDataCriacao(LocalDateTime.now());
    }

    public Livro() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
