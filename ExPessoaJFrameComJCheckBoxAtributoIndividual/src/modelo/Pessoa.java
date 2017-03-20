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
    private String manga;
    private String anime;
    
    public Pessoa() {    
        manga = "";
        anime = "";
    }

    public Pessoa(String nome, String manga, String anime) {
        this.nome = nome;
        this.manga = manga;
        this.anime = anime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    @Override
    public String toString() {
        return "\nNome  " + nome 
              +"\nPreferências: " 
              +"\n" + manga
              +"\n" + anime;
    }
}