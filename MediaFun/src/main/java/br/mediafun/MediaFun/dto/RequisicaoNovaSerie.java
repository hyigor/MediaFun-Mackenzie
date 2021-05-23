package br.mediafun.MediaFun.dto;


import br.mediafun.MediaFun.model.Serie;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;


public class RequisicaoNovaSerie {

    @NotBlank
    private String nomeTitulo;
    @NotBlank
    private String elenco;
    @NotBlank
    private String numTemporadas;
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

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(String numTemporadas) {
        this.numTemporadas = numTemporadas;
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


    public Serie toSerie() {
        Serie serie = new Serie(getNomeTitulo(), getElenco(), conver(), getUrlImagem(), "Série");
        System.out.println(anoLancamento);
        int ano = Integer.parseInt(anoLancamento);
        serie.setAnoLancamento(ano);
        serie.setGenero(genero);
        serie.setPais(pais);
        serie.setSinopse(sinopse);
        return serie;
    }


    public int conver(){
        int temp = Integer.parseInt(getNumTemporadas());
        return temp;
    }

}
