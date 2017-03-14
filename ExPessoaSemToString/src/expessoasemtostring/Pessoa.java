/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expessoasemtostring;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class Pessoa {

    //Atributos da classe Pessoa
    private String nome;
    private byte idade;

    //Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    //Método de cálculo.
    public int calcularIdadeMeses() {
        return idade * 12;
    }//fecha método calcularIdadeMeses
}//fecha classe