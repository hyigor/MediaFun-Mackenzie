package br.mediafun.MediaFun.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="idPerfil")
public class Usuario extends Perfil{

    private Date dataNascimento;
    private String cidade;
    private String estado;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "usuario")
    private List<Usuario> amigos = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    private List<Avaliacao> avaliacaos = new ArrayList<>();

    @OneToMany(mappedBy = "usuario")
    private List<Item> numRecomendacoes = new ArrayList<>();

    public Usuario(String nome, String username, String senha, Date dataNascimento, String cidade, String estado, String url, String tipo) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cidade = cidade;
        this.estado = estado;
        this.url = url;
        this.tipo = tipo;
        setDataCriacao(LocalDateTime.now());
    }

    public Usuario() {

    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }

    public void setAvaliacaos(List<Avaliacao> avaliacaos) {
        this.avaliacaos = avaliacaos;
    }

    public List<Item> getNumRecomendacoes() {
        return numRecomendacoes;
    }

    public void setNumRecomendacoes(List<Item> numRecomendacoes) {
        this.numRecomendacoes = numRecomendacoes;
    }
}
