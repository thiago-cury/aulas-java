/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Pessoa {

    //Atributos da classe
    private String nome;
    private int idade;

    //Métodos construtores
    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /* métodos acessores */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade; 
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return retorna a idade da pessoa em meses
     */
    public int calcularIdadeMeses() {
        return idade * 12;
    }

    @Override
    public String toString() {
        return "Nome: " + nome
              +"\nIdade: " + idade
              +"\nIdade em meses: " + calcularIdadeMeses();
    }
}//fecha classe