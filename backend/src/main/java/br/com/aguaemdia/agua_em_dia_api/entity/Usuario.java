package br.com.aguaemdia.agua_em_dia_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150) //Restrição NOT NULL
    private String nome;

    @Column(nullable = false, unique = true ,length = 150) //Restrição unique e Not null
    private String nomeUsuario;

    @Column(nullable = false, unique = true, length = 14 )
    private String cpf;

    @Column (nullable = false, unique = true, length = 150)
    private String email;

    @Column(nullable = false, length = 20)
    private String telefone;

    @Column(nullable = false)
    private String senha;

    public Usuario() {

    }


        public Long getId () {
            return id;
        }


        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public String getNomeUsuario () {
            return nomeUsuario;
        }

        public void setNomeUsuario (String nomeUsuario){
            this.nomeUsuario = nomeUsuario;
        }

        public String getCpf () {
            return cpf;
        }

        public void setCpf (String cpf){
            this.cpf = cpf;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getTelefone () {
            return telefone;
        }

        public void setTelefone (String telefone){
            this.telefone = telefone;
        }

        public String getSenha () {
            return senha;
        }

        public void setSenha (String senha){
            this.senha = senha;
        }

}
