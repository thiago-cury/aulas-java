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

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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
     * @return idade em meses. (*12)
     */
    public int calcularIdadeMeses(){
        return idade * 12;
    }
    
    /**
     * 
     * @return idade em semanas.(*52)
     */
    public int calcularIdadeSemanas(){
        return idade * 52;
    }
    
    /**
     * 
     * @return idade em dias. (*365)
     */
    public int calcularIdadeDias(){
        return idade * 365;
    }

    @Override
    public String toString() {
        return "Nome "+nome
                +"\nIdade "+idade
                +"\nEm meses "+calcularIdadeMeses()
                +"\nEm semanas "+calcularIdadeSemanas()
                +"\nEm Dias "+calcularIdadeDias();
    }
}//fecha classe