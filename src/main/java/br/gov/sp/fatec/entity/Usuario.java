package br.gov.sp.fatec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="usr_usuario")
public class Usuario {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "usr_id")
    private Long id;

    @Column (name = "usr_nome")
    private String nome;

    @Column (name = "usr_senha")
    private String senha;

    public Usuario (){}

    public Usuario(String nome, String senha){
        this();
        this.nome = nome;
        this.senha = senha;
    }

    public Long getId(){
        this.id = id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

}
