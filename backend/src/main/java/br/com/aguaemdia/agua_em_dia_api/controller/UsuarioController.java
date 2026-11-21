package br.com.aguaemdia.agua_em_dia_api.controller;

import br.com.aguaemdia.agua_em_dia_api.dto.UsuarioCadastroDTO;
import br.com.aguaemdia.agua_em_dia_api.entity.Usuario;
import br.com.aguaemdia.agua_em_dia_api.service.UsuarioService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //Edpoint para cadastras o usuário

    @PostMapping
    public ResponseEntity<Map<String, Object>> cadastrar(
            @Valid @RequestBody UsuarioCadastroDTO dados) {

        Usuario usuario = usuarioService.cadastrar(dados);
        Map<String, Object> resposta = Map.of(
                "mensagem", "Usuário cadastrado com sucesso.",
                "id", usuario.getId()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }

}
