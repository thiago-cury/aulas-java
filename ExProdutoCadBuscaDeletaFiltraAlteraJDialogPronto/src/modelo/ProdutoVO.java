/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ProdutoVO {
    
    //Atributos da classe
    private long idProduto;
    private String nome;
    private double valorCusto;
    private int quantidade;

    public ProdutoVO() {
    }

    public ProdutoVO(long idProduto, String nome, double valorCusto, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.quantidade = quantidade;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoVO{" + "idProduto=" + idProduto + ", nome=" + nome + ", valorCusto=" + valorCusto + ", quantidade=" + quantidade + '}';
    }
}