package br.mediafun.MediaFun.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idPerfil")
public class Gerente extends Perfil{

    public Gerente(String nome, String username, String senha, String tipo, String url){
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.tipo = tipo;
        this.url = url;
        setDataCriacao(LocalDateTime.now());
    }


}
