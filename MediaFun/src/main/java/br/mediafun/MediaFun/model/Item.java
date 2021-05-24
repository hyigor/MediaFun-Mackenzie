package br.mediafun.MediaFun.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idItem;
    protected String titulo;
    protected String pais;
    protected int anoLancamento;
    protected Date dataCriacao;
    protected String tipo;
    protected String url;

    @ManyToOne(fetch = FetchType.LAZY)
    protected User user;

    @OneToMany(mappedBy = "item")
    protected List<Avaliacao> avaliacoes = new ArrayList<>();

    protected String genero;
    @Lob
    @Column( length = 100000 )
    protected String sinopse;

    @Enumerated(EnumType.STRING)
    protected StatusItem status = StatusItem.AGUARDANDO;

    public Long getId() {
        return idItem;
    }

    public void setId(Long id) {
        this.idItem = idItem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
        System.out.println(anoLancamento);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        Date data = Date.valueOf(dataCriacao.toLocalDate());
        this.dataCriacao = data;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public StatusItem getStatus() {
        return status;
    }

    public void setStatus(StatusItem status) {
        this.status = status;
    }



    public String getTipo() {
        return tipo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
