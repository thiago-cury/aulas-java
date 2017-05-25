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
     * @return retorna a idade em meses
     */
    public int calcularIdadeMeses(){
        return idade * 12;
    }
    
    /**
     * 
     * @param a recebe o dividendo
     * @param b recebe o divisor
     * @return retorna a divisão de a por b
     * @throws divisão por zero.
     * @exception lança e trata exceção aritmética de divisão por zero.
     */
    public int dividir(int a, int b) throws ArithmeticException{
        int resp = 0;
        try {
            resp = a/b;
        } catch (ArithmeticException ae) {
            throw new ArithmeticException(
                  "Divisão por zero!");
        }
        return resp;
    }
    
    @Override
    public String toString() {
        return "Nome: "+nome
            +"\nIdade: "+idade
            +"\nIdade em meses: "+calcularIdadeMeses();
    }
}
