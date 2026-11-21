
package br.com.aguaemdia.agua_em_dia_api.dto;

import jakarta.validation.constraints.NotBlank;

public class LoginDTO {
 
    //impede que o usuário deixe o canponem branco, retorna a mensagem caso isso aconteça 
    @NotBlank(message = "Informe seu e-mail ou nome de usuário.")
    private String identificador;

    @NotBlank(message = "Informe sua senha cadastrada.")
    private String senha;


    public String getIdentificador() {
        return identificador;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
