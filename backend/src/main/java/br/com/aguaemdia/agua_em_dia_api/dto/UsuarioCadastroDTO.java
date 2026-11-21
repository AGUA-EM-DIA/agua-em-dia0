package br.com.aguaemdia.agua_em_dia_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

//Recebe as informações digitadas oelo usuario no frot
public class UsuarioCadastroDTO {

    @NotBlank
    @Size(max = 150)
    private String nome;

    @NotBlank
    @Size(max = 150)
    private String nomeUsuario;

    @NotBlank
    @Size(max = 14)
    private String cpf;

    @NotBlank
    @Email
    @Size(max = 150)
    private String email;

    @NotBlank
    @Size(max = 20)
    private String telefone;

    @NotBlank
    @Size(min = 8 , max = 100)
    private String senha;

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getNomeUsuario() {
         return nomeUsuario;
     }

     public void setNomeUsuario(String nomeUsuario) {
         this.nomeUsuario = nomeUsuario;
     }

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         this.cpf = cpf;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getTelefone() {
         return telefone;
     }

     public void setTelefone(String telefone) {
         this.telefone = telefone;
     }

     public String getSenha() {
         return senha;
     }

     public void setSenha(String senha) {
         this.senha = senha;
     }




 }
