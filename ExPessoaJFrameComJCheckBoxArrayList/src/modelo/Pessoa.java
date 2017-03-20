/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Pessoa {
    
    private String nome;
    private ArrayList<String> prefs; //ANIME, MANGÁ
    
    public Pessoa() {
    }

    public Pessoa(String nome, ArrayList<String> prefs) {
        this.nome = nome;
        this.prefs = prefs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getPrefs() {
        return prefs;
    }

    public void setPrefs(ArrayList<String> prefs) {
        this.prefs = prefs;
    }

    @Override
    public String toString() {
        
        //Gambi para tirar os colchetes [] do ArrayList
        String x = "";
        for(int i = 0; i < prefs.size() ; i++){
            x = x + "\n"+prefs.get(i);
        }
        
        return "\nNome " + nome 
              +"\nPreferencias: " + x;
    }
}