/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
/**
 *
 * @author 74790986004
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    private List<Viagem> viagens;

    public Usuario(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.viagens = new ArrayList<>();
    }

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public Viagem criaViagem(String nome, Local origem, Local destino) {
        Viagem novaViagem = new Viagem(nome, origem, destino);
        novaViagem.setUsuario(this);
        viagens.add(novaViagem);
        return novaViagem;
    }

    public void adicionaParada(Viagem viagem, Local local) {
        if (viagens.contains(viagem) && !local.equals(viagem.getOrigem()) && !local.equals(viagem.getDestino())) {
            viagem.adicionaParada(local);
        } else {
            throw new IllegalArgumentException("Não é possível adicionar a parada: local inválido ou viagem não pertence ao usuário.");
        }
    }

    public List<Viagem> listViagem() {
        return viagens;
    }

    // Getters and setters for login, senha, and nome
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

