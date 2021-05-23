package br.mediafun.MediaFun.dto;


import br.mediafun.MediaFun.model.Filme;

import javax.validation.constraints.NotBlank;


public class RequisicaoNovoFilme {

    @NotBlank
    private String nomeTitulo;
    @NotBlank
    private String diretor;
    @NotBlank
    private String elenco;
    @NotBlank
    private String duracao;
    @NotBlank
    private String pais;
    @NotBlank
    private String anoLancamento;
    @NotBlank
    private String genero;
    @NotBlank
    private String urlImagem;
    @NotBlank
    private String sinopse;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Filme toFilme() {
        Filme filme = new Filme(getNomeTitulo(), getDiretor(), getElenco(), getDuracao(), getUrlImagem(), "Filme");
        System.out.println(anoLancamento);
        int ano = Integer.parseInt(anoLancamento);
        filme.setAnoLancamento(ano);
        filme.setGenero(genero);
        filme.setPais(pais);
        filme.setSinopse(sinopse);
        return filme;
    }

}

