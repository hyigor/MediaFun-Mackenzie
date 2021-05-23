package br.mediafun.MediaFun.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Serie extends Item{

    private String elencoPrincipal;
    private int numTemporadas;

    public Serie(String titulo, String elencoPrincipal, int numTemporadas, String url, String tipo){
        this.titulo = titulo;
        this.elencoPrincipal = elencoPrincipal;
        this.numTemporadas = numTemporadas;
        this.url = url;
        this.tipo = tipo;
        setDataCriacao(LocalDateTime.now());
    }

    public Serie() {

    }

    public String getElencoPrincipal() {
        return elencoPrincipal;
    }

    public void setElencoPrincipal(String elencoPrincipal) {
        this.elencoPrincipal = elencoPrincipal;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
}
