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

public class Viagem {
    private String nome;
    private Usuario usuario;
    private List<Parada> paradas;
    private float totalGasto;

    public Viagem(String nome, Local origem, Local destino) {
        this.nome = nome;
        this.paradas = new ArrayList<>();
        this.paradas.add(new Parada(origem));
        this.paradas.add(new Parada(destino));
        this.totalGasto = 0.0f; // Inicializa o total gasto como 0
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Local getOrigem() {
        return paradas.get(0).getLocal();
    }

    public Local getDestino() {
        return paradas.get(paradas.size() - 1).getLocal();
    }

    private Parada adicionaParada(Local loc) {
        Parada novaParada = new Parada(loc);
        paradas.add(paradas.size() - 1, novaParada);
        return novaParada;
    }

    public List<Parada> listParada() {
        return paradas;
    }

    public float totalGasto() {
        return totalGasto;
    }

    public void adicionaGasto(float valor) {
        this.totalGasto += valor;
    }
}

