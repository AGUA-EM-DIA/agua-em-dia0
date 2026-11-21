package br.com.aguaemdia.agua_em_dia_api.service;

import br.com.aguaemdia.agua_em_dia_api.dto.UsuarioCadastroDTO;
import br.com.aguaemdia.agua_em_dia_api.entity.Usuario;
import br.com.aguaemdia.agua_em_dia_api.repository.UsuarioRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository,
                          PasswordEncoder passwordEncoder){
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //METODO DE CADASTRO DO USUÁRIO

    public Usuario cadastrar(UsuarioCadastroDTO dados){

        //VERIFICA SE O EMAIL JÁ ESTÁ    CADASTRADO
        if(usuarioRepository.existsByEmail(dados.getEmail())){
            throw new IllegalArgumentException("Email já cadastrado.");
        }
        //VERIFICA SE O NOME DE USUÁRIO JÁ ESTÁ CADASTRADO
        if(usuarioRepository.existsByNomeUsuario(dados.getNomeUsuario())){
            throw new IllegalArgumentException("Nome de usuário já cadastrado");
        }

        //VERIFICA SE O CPF JÁ ESTÁ CADASTRADO

        if(usuarioRepository.existsByCpf(dados.getCpf())){
            throw new IllegalArgumentException("CPF já cadastrado.");
        }

        Usuario usuario = new Usuario();

        usuario.setNome(dados.getNome());
        usuario.setNomeUsuario(dados.getNomeUsuario());
        usuario.setCpf(dados.getCpf());
        usuario.setEmail(dados.getEmail());
        usuario.setTelefone(dados.getTelefone());

        //Criptografa a senha antes de salvar no banco de dados
        usuario.setSenha(passwordEncoder.encode(dados.getSenha()));

        return usuarioRepository.save(usuario);//SALVA O USUÁRIO NO BANCO DE DADOS

    }
}
