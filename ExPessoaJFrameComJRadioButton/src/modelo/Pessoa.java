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
    private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return verifica através de um if testando o sexo se é homem ou mulher.
     */
    public String verificarSexo(){
        if(sexo.equalsIgnoreCase("Masculino")){
            return "Você é homem!";
        }else{
            return "Você é mulher!";
        }//fecha else
    }//fecha verificar
    
    @Override
    public String toString() {
        return "Nome: "+nome
              +"\nSexo: "+sexo
              +"\nVerificação: "+verificarSexo();
    }
}//fecha classe