/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author 74790986004
 */
public class Parada {
    private Date dataHoraChegada;
    private Date dataHoraPartida;
    private String observacao;
    private Local local;
    private Viagem viagem;
    private List<Gasto> listaGastos;

    public Parada(String observacao, Local local) {
        this.observacao = observacao;
        this.local = local;
        this.listaGastos = new ArrayList<>();
    }

    public Local getLocal() {
        return local;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public List<Gasto> listGasto() {
        return listaGastos;
    }

    public void registraDataHoraChegada(Date dh) {
        if (this.dataHoraPartida != null && dh.after(this.dataHoraPartida)) {
            throw new IllegalArgumentException("DataHoraChegada deve ser antes de DataHoraPartida.");
        }
        this.dataHoraChegada = dh;
    }

    public void registraDataHoraPartida(Date dh) {
        if (this.dataHoraChegada != null && dh.before(this.dataHoraChegada)) {
            throw new IllegalArgumentException("DataHoraPartida deve ser depois de DataHoraChegada.");
        }
        this.dataHoraPartida = dh;
    }

    public Gasto adicionaGasto(float valor, String descricao) {
        Gasto gasto = new Gasto(valor, descricao);
        this.listaGastos.add(gasto);
        return gasto;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Date getDataHoraChegada() {
        return dataHoraChegada;
    }

    public Date getDataHoraPartida() {
        return dataHoraPartida;
    }
}

