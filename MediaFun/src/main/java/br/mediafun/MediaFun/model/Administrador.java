package br.mediafun.MediaFun.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idPerfil")
public class Administrador extends Perfil{

    public Administrador(String nome, String username, String senha, String url, String tipo){
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.url = url;
        this.tipo = tipo;
        setDataCriacao(LocalDateTime.now());
    }

}
