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
class Gasto {
    private float valor;
    private String descricao;

    public Gasto(float valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
