package br.mediafun.MediaFun.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double numeroJoinhas;
    @ManyToOne
    private Item item;
    private String textoAnalise;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "avaliacao")
    private List<Comentario> comentarios = new ArrayList<>();
    private int nota;

    public Avaliacao(Item item, String textoAnalise, int nota) {
        this.item = item;
        this.textoAnalise = textoAnalise;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNumeroJoinhas() {
        return numeroJoinhas;
    }

    public void setNumeroJoinhas(Double numeroJoinhas) {
        this.numeroJoinhas = numeroJoinhas;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getTextoAnalise() {
        return textoAnalise;
    }

    public void setTextoAnalise(String textoAnalise) {
        this.textoAnalise = textoAnalise;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
